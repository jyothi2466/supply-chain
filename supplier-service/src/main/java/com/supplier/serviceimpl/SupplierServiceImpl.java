package com.supplier.serviceimpl;

import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	private final Logger logger = LoggerFactory.getLogger(SupplierServiceImpl.class);

	@Autowired
	private SupplierRepository supplierRepository;

	@Autowired
	private SupplierMapper supplierMapper;

	/*
	 * public SupplierServiceImpl(SupplierRepository supplierRepository,
	 * SupplierMapper supplierMapper) { super(); this.supplierRepository =
	 * supplierRepository; this.supplierMapper = supplierMapper; }
	 */

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
	public SupplierModel createSupplier(Optional<SupplierModel> optionalSupplierModel) {
		logger.info("***createSupplier-serviceImpl***");
		optionalSupplierModel.get().setSupplierGuid(UUID.randomUUID().toString());
		Supplier supplier = supplierRepository.save(supplierMapper.modelToSupplier(optionalSupplierModel.get()));
		return supplierMapper.supplierToModel(supplier);
	}

	@Override
	public SupplierModel findSupplierByGuid(String supplierGuid) {
		Optional<Supplier> optionalSupplier = supplierRepository.findById(supplierGuid);
		if (optionalSupplier.isPresent()) {
			return supplierMapper.supplierToModel(optionalSupplier.get());
		} else {
			throw new SupplierNotFoundException(SupplierConstant.supplierErrorMessage);
		}

	}

	@Override
	public SupplierModel updateSupplier(Optional<SupplierModel> optionalSupplierModel) {

//		Optional<Object> optionalSupplier = optionalSupplierModel.map(SupplierModel::getSupplierGuid)
//			.map(supplierGuid -> supplierRepository.findById(supplierGuid));

		Supplier supplier = supplierRepository.save(supplierMapper.modelToSupplier(optionalSupplierModel.get()));
		return supplierMapper.supplierToModel(supplier);
	}

	@Override
	public void deleteSupplier(String supplierGuid) {
		supplierRepository.deleteById(supplierGuid);
	}
}
