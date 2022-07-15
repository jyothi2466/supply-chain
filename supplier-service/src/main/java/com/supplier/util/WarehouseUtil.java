package com.supplier.util;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.supplier.entity.Address;
import com.supplier.entity.Contact;
import com.supplier.entity.ContactType;
import com.supplier.entity.Location;
import com.supplier.entity.Supplier;
import com.supplier.entity.Warehouse;
import com.supplier.exception.SupplierNotFoundException;
import com.supplier.mapper.WarehouseMapper;
import com.supplier.model.ContactModel;
import com.supplier.model.LocationModel;
import com.supplier.model.WarehouseModel;

public class WarehouseUtil {

	static public Warehouse mapModelToWarehouse(Optional<WarehouseModel> optionalWarehouseModel,
			WarehouseMapper warehouseMapper) {

		WarehouseModel warehouseModel = optionalWarehouseModel
				.orElseThrow(() -> new SupplierNotFoundException("No Data"));

		Warehouse warehouse = warehouseMapper.modelToWarehouse(warehouseModel);
		warehouse.setWarehouseGuid(UUID.randomUUID().toString());

		warehouse.setLocation(mapModelToLocation(optionalWarehouseModel, warehouseMapper));

		List<Contact> contactList = optionalWarehouseModel.map(WarehouseModel::getContactModels)
				.orElseThrow(() -> new SupplierNotFoundException("No Contact Information")).stream()
				.map(contactModel -> mapModelToContact(contactModel, warehouseMapper, warehouse))
				.collect(Collectors.toList());
		
		warehouse.setContacts(contactList);

		Supplier supplier = new Supplier();
		supplier.setSupplierGuid(optionalWarehouseModel.map(WarehouseModel::getSupplierGuid)
				.orElseThrow(() -> new SupplierNotFoundException("No Supplier Information")));
		warehouse.setSupplier(supplier);

		return warehouse;
	}

	static public Contact mapModelToContact(ContactModel contactModel, WarehouseMapper warehouseMapper,
			Warehouse warehouse) {
		
		contactModel.setContactGuid(UUID.randomUUID().toString());
		contactModel.setContactTypeId(contactModel.getContactTypeId());
		Contact contact = warehouseMapper.modelToContact(contactModel);
		ContactType contactType = new ContactType();
		contactType.setContactTypeId(contactModel.getContactTypeId());
		contact.setContactType(contactType);
		contact.setWarehouse(warehouse);
		return contact;
	}

	static public Location mapModelToLocation(Optional<WarehouseModel> optionalWarehouseModel,
			WarehouseMapper warehouseMapper) {

		Optional<Location> optionalLocation = optionalWarehouseModel.map(WarehouseModel::getLocationModel)
				.map(locationModel -> warehouseMapper.modelToLocation(locationModel));

		Location location = optionalLocation.orElseThrow(() -> new RuntimeException("Location Details Not Found"));
		location.setLocationGuid(UUID.randomUUID().toString());

		Optional<Address> optionalAddress = optionalWarehouseModel.map(WarehouseModel::getLocationModel)

				.map(LocationModel::getAddressModel).map(addressModel -> warehouseMapper.modelToAddress(addressModel));

		Address address = optionalAddress.orElseThrow(() -> new RuntimeException("Address Details Not Found"));

		address.setAddressGuid(UUID.randomUUID().toString());
		location.setAddress(address);

		return location;
	}
}
