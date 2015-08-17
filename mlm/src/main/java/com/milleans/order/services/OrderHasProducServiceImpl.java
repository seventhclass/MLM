package com.milleans.order.services;

import com.milleans.common.dao.IParameterDao;
import com.milleans.model.OrderHasProduct;
import com.milleans.order.dao.IorderHasProductDao;
import com.milleans.order.dto.OrderHasProductDTO;
import com.milleans.order.dto.OrderProducts;
import com.milleans.order.dto.OrderSummaryDto;
import com.milleans.tools.Constant;
import com.milleans.tools.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeHu on 7/10/15 12:11 PM.
 */
@Service("orderHasProductService")
@Transactional
public class OrderHasProducServiceImpl implements IorderHasProductService {

    @Autowired
    private IorderHasProductDao orderHasProductDao;

    @Autowired
    private IParameterDao parameterDao;

    @Override
    public void save(Object object) {
        orderHasProductDao.save(object);
    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public Object getItemById(String id) {
        return null;
    }

    @Override
    public void save(List<OrderHasProduct> orderHasProductList) {
        for (OrderHasProduct orderHasProduct : orderHasProductList) {
            this.save(orderHasProduct);
        }
    }

    @Override
    public void removeProduct(int product) {

    }

    @Override
    public List<OrderProducts> getProductsByOrderId(int orderId) {

        List<OrderProducts> list = orderHasProductDao.getProducts(orderId);

        return list;
    }

    @Override
    public OrderSummaryDto getOrderSummary(int orderId) {

        OrderSummaryDto orderSummaryDto = null;

        //Map<String, String> map = parameterDao.getMapValues();

        //
        orderSummaryDto = this.orderHasProductDao.getOrderSummary(orderId);

//        double tps = Double.valueOf(map.get(Constant.TPS));
//        double tvq = Double.valueOf(map.get(Constant.TVQ));
//        double total = Double.valueOf(orderSummaryDto.getSubTotal()) * (tps + 1) * (tvq + 1);
        double subTotal = Double.valueOf(orderSummaryDto.getSubTotal());
        orderSummaryDto.setSubTotal(Utils.decimalFormat.format(subTotal));
        double tax = subTotal * Constant.TaxRate;
        orderSummaryDto.setTax(String.valueOf(Utils.decimalFormat.format(tax)));
        orderSummaryDto.setTaxRate(String.valueOf(Constant.TaxRate));

        System.out.println("=-----" + (subTotal + tax));

        orderSummaryDto.setTotal(Utils.decimalFormat.format(subTotal + tax));

//        orderSummaryDto.setTotal(String.valueOf(total));
//        orderSummaryDto.setTax((float) (Double.valueOf(orderSummaryDto.getTotal()) - Double.valueOf(orderSummaryDto.getSubTotal())));

        //orderSummaryDto.setTotal();

        return orderSummaryDto;
    }

    @Override
    public ArrayList<OrderHasProductDTO> getItem(int orderId) {
        return orderHasProductDao.getItem(orderId);
    }

    @Override
    public void deleteOrderProductShip(String orderId) {
        orderHasProductDao.deleteOrderProductShip(orderId);
    }


}
