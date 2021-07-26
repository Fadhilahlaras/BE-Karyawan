package karyawan.manager.service;


import karyawan.manager.dao.PositionDao;
import karyawan.manager.dao.impl.PositionDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    private PositionDaoImpl positionDaoImp;

    @Override
    public PositionDao getPosition(PositionDao positionDao){
        return positionDao;
    }



}
