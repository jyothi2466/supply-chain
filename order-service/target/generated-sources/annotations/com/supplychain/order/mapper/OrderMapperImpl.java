package com.supplychain.order.mapper;

import com.supplychain.order.entities.History;
import com.supplychain.order.entities.LineItem;
import com.supplychain.order.entities.Order;
import com.supplychain.order.entities.OrderStoreSupplier;
import com.supplychain.order.model.HistoryModel;
import com.supplychain.order.model.LineItemModel;
import com.supplychain.order.model.OrderModel;
import com.supplychain.order.model.OrderStoreSupplierModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-14T12:11:39+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.50.v20210914-1429, environment: Java 17.0.2 (Eclipse Adoptium)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderModel orderToModel(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderModel orderModel = new OrderModel();

        orderModel.setOrderGuid( order.getOrderGuid() );
        orderModel.setActualDeliveryDate( order.getActualDeliveryDate() );
        orderModel.setCreatedBy( order.getCreatedBy() );
        orderModel.setCreatedDate( order.getCreatedDate() );
        orderModel.setEstimatedDeliveryDate( order.getEstimatedDeliveryDate() );
        orderModel.setPriority( order.getPriority() );
        orderModel.setShipmentPrice( order.getShipmentPrice() );
        orderModel.setTotalItemPrice( order.getTotalItemPrice() );
        orderModel.setTotalOfferPrice( order.getTotalOfferPrice() );
        orderModel.setTotalOrderPrice( order.getTotalOrderPrice() );
        orderModel.setTransitDays( order.getTransitDays() );

        return orderModel;
    }

    @Override
    public Order modelToOrder(OrderModel orderModel) {
        if ( orderModel == null ) {
            return null;
        }

        Order order = new Order();

        order.setOrderGuid( orderModel.getOrderGuid() );
        order.setActualDeliveryDate( orderModel.getActualDeliveryDate() );
        order.setCreatedBy( orderModel.getCreatedBy() );
        order.setCreatedDate( orderModel.getCreatedDate() );
        order.setEstimatedDeliveryDate( orderModel.getEstimatedDeliveryDate() );
        order.setPriority( orderModel.getPriority() );
        order.setShipmentPrice( orderModel.getShipmentPrice() );
        order.setTotalItemPrice( orderModel.getTotalItemPrice() );
        order.setTotalOfferPrice( orderModel.getTotalOfferPrice() );
        order.setTotalOrderPrice( orderModel.getTotalOrderPrice() );
        order.setTransitDays( orderModel.getTransitDays() );

        return order;
    }

    @Override
    public LineItem modelToLineItem(LineItemModel lineItemModel) {
        if ( lineItemModel == null ) {
            return null;
        }

        LineItem lineItem = new LineItem();

        lineItem.setLineItemGuid( lineItemModel.getLineItemGuid() );
        lineItem.setOfferPrice( lineItemModel.getOfferPrice() );
        lineItem.setProductCode( lineItemModel.getProductCode() );
        lineItem.setQuantity( lineItemModel.getQuantity() );
        lineItem.setTotalPrice( lineItemModel.getTotalPrice() );
        lineItem.setUnitPrice( lineItemModel.getUnitPrice() );

        return lineItem;
    }

    @Override
    public LineItemModel lineItemToModel(LineItem lineItem) {
        if ( lineItem == null ) {
            return null;
        }

        LineItemModel lineItemModel = new LineItemModel();

        lineItemModel.setLineItemGuid( lineItem.getLineItemGuid() );
        lineItemModel.setOfferPrice( lineItem.getOfferPrice() );
        lineItemModel.setProductCode( lineItem.getProductCode() );
        lineItemModel.setQuantity( lineItem.getQuantity() );
        lineItemModel.setTotalPrice( lineItem.getTotalPrice() );
        lineItemModel.setUnitPrice( lineItem.getUnitPrice() );

        return lineItemModel;
    }

    @Override
    public OrderStoreSupplier modelToOrderStoreSupplier(OrderStoreSupplierModel orderStoreSupplierModel) {
        if ( orderStoreSupplierModel == null ) {
            return null;
        }

        OrderStoreSupplier orderStoreSupplier = new OrderStoreSupplier();

        orderStoreSupplier.setOssGuid( orderStoreSupplierModel.getOssGuid() );
        orderStoreSupplier.setStoreCode( orderStoreSupplierModel.getStoreCode() );
        orderStoreSupplier.setSupplierCode( orderStoreSupplierModel.getSupplierCode() );

        return orderStoreSupplier;
    }

    @Override
    public OrderStoreSupplierModel orderStoreSupplierToModel(OrderStoreSupplier orderStoreSupplier) {
        if ( orderStoreSupplier == null ) {
            return null;
        }

        OrderStoreSupplierModel orderStoreSupplierModel = new OrderStoreSupplierModel();

        orderStoreSupplierModel.setOssGuid( orderStoreSupplier.getOssGuid() );
        orderStoreSupplierModel.setStoreCode( orderStoreSupplier.getStoreCode() );
        orderStoreSupplierModel.setSupplierCode( orderStoreSupplier.getSupplierCode() );

        return orderStoreSupplierModel;
    }

    @Override
    public History modelToHistory(HistoryModel historyModel) {
        if ( historyModel == null ) {
            return null;
        }

        History history = new History();

        history.setHistoryGuid( historyModel.getHistoryGuid() );
        history.setRemarks( historyModel.getRemarks() );
        history.setUpdatedBy( historyModel.getUpdatedBy() );
        history.setUpdatedDate( historyModel.getUpdatedDate() );

        return history;
    }

    @Override
    public HistoryModel historyToModel(History history) {
        if ( history == null ) {
            return null;
        }

        HistoryModel historyModel = new HistoryModel();

        historyModel.setHistoryGuid( history.getHistoryGuid() );
        historyModel.setRemarks( history.getRemarks() );
        historyModel.setUpdatedBy( history.getUpdatedBy() );
        historyModel.setUpdatedDate( history.getUpdatedDate() );

        return historyModel;
    }
}
