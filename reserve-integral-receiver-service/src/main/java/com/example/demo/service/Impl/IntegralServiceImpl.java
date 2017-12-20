package com.example.demo.service.Impl;

import com.example.demo.dao.IntegralDao;
import com.example.demo.dto.OrderInfo;
import com.example.demo.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ningcs on 2017/11/6.
 */
@Service
public class IntegralServiceImpl implements IntegralService {
    @Autowired
    private IntegralDao integralDao;

    @Override
    @Transactional
    public void addIntegral(OrderInfo orderInfo) {
        integralDao.addIntegral(orderInfo);
    }
}
