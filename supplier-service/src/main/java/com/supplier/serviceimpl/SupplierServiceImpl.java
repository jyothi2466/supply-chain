package com.supplier.serviceimpl;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.supplier.entity.Supplier;
import com.supplier.exception.SupplierNotFoundException;
import com.supplier.mapper.SupplierMapper;
import com.supplier.model.SupplierModel;
import com.supplier.repository.SupplierRepository;
import com.supplier.service.SupplierService;
import com.supplier.util.SupplierConstant;

@Service
public class SupplierServiceImpl implements SupplierService {

	//@Autowired
	private SupplierRepository supplierRepository;

	//@Autowired
	private SupplierMapper supplierMapper;	
	
	public SupplierServiceImpl(SupplierRepository supplierRepository, SupplierMapper supplierMapper) {
		super();
		this.supplierRepository = supplierRepository;
		this.supplierMapper = supplierMapper;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public SupplierModel createSupplier(Optional<SupplierModel> optionalSupplierModel) {
		if (optionalSupplierModel.isPresent()) {
			SupplierModel supplierModel = optionalSupplierModel.get();
			supplierModel.setSupplierGuid(UUID.randomUUID().toString());
			Supplier supplier = supplierRepository.save(supplierMapper.modelToSupplier(supplierModel));
			return supplierMapper.supplierToModel(supplier);
		} else {
			throw new RuntimeException("Should not be null");
		}
	}
	

	@Override
	public SupplierModel findSupplierByGuid(String supplierGuid) {
		Optional<Supplier> optionalSupplier = supplierRepository.findById(supplierGuid);
		if(optionalSupplier.isPresent()) {
			return supplierMapper.supplierToModel(optionalSupplier.get());
		}else {
			throw new SupplierNotFoundException(SupplierConstant.supplierErrorMessage);
		}
			
	}
}
