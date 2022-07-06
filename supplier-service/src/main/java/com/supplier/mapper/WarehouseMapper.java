package com.supplier.mapper;

import org.mapstruct.Mapper;

import com.supplier.entity.Address;
import com.supplier.entity.Contact;
import com.supplier.entity.Location;
import com.supplier.entity.Warehouse;
import com.supplier.model.AddressModel;
import com.supplier.model.ContactModel;
import com.supplier.model.LocationModel;
import com.supplier.model.WarehouseModel;

@Mapper(componentModel = "spring")
public interface WarehouseMapper {
	
	public Warehouse modelToWarehouse(WarehouseModel warehouseModel);

	public WarehouseModel warehouseToModel(Warehouse warehouse);
	
	public Contact modelToContact(ContactModel contactModel);
	
	public ContactModel contactToModel(Contact contact);
	
	public Location modelToLocation(LocationModel locationModel);
	
	public LocationModel locationToModel(Location location);
	
	public Address modelToAddress(AddressModel addressModel);
	
	public AddressModel addressToModel(Address address);
	
	
}
