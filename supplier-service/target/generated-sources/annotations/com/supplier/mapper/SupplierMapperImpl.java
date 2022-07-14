package com.supplier.mapper;

import com.supplier.entity.Supplier;
import com.supplier.entity.Warehouse;
import com.supplier.model.SupplierModel;
import com.supplier.model.WarehouseModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-14T11:37:50+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class SupplierMapperImpl implements SupplierMapper {

    @Override
    public Supplier modelToSupplier(SupplierModel supplierModel) {
        if ( supplierModel == null ) {
            return null;
        }

        Supplier supplier = new Supplier();

        supplier.setSupplierGuid( supplierModel.getSupplierGuid() );
        supplier.setCompanyName( supplierModel.getCompanyName() );
        supplier.setRegistrationNumber( supplierModel.getRegistrationNumber() );
        supplier.setSupplierCode( supplierModel.getSupplierCode() );

        return supplier;
    }

    @Override
    public SupplierModel supplierToModel(Supplier supplier) {
        if ( supplier == null ) {
            return null;
        }

        SupplierModel supplierModel = new SupplierModel();

        supplierModel.setSupplierGuid( supplier.getSupplierGuid() );
        supplierModel.setCompanyName( supplier.getCompanyName() );
        supplierModel.setRegistrationNumber( supplier.getRegistrationNumber() );
        supplierModel.setSupplierCode( supplier.getSupplierCode() );

        return supplierModel;
    }

    @Override
    public Warehouse modelToEntity(WarehouseModel warehouseModel) {
        if ( warehouseModel == null ) {
            return null;
        }

        Warehouse warehouse = new Warehouse();

        warehouse.setWarehouseGuid( warehouseModel.getWarehouseGuid() );
        warehouse.setName( warehouseModel.getName() );
        warehouse.setWarehouseCode( warehouseModel.getWarehouseCode() );
        warehouse.setContact( warehouseModel.getContact() );
        warehouse.setLocation( warehouseModel.getLocation() );

        return warehouse;
    }

    @Override
    public WarehouseModel entityToModel(Warehouse warehouse) {
        if ( warehouse == null ) {
            return null;
        }

        WarehouseModel warehouseModel = new WarehouseModel();

        warehouseModel.setWarehouseGuid( warehouse.getWarehouseGuid() );
        warehouseModel.setName( warehouse.getName() );
        warehouseModel.setWarehouseCode( warehouse.getWarehouseCode() );
        warehouseModel.setContact( warehouse.getContact() );
        warehouseModel.setLocation( warehouse.getLocation() );

        return warehouseModel;
    }
}
