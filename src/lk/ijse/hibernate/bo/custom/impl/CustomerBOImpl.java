package lk.ijse.hibernate.bo.custom.impl;

import lk.ijse.hibernate.bo.custom.CustomerBO;
import lk.ijse.hibernate.dao.DAOFactory;
import lk.ijse.hibernate.dao.DAOType;
import lk.ijse.hibernate.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.hibernate.dto.CustomerDTO;
import lk.ijse.hibernate.entity.Customer;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAOImpl customerDAO = DAOFactory.getInstance().getDAO(DAOType.CUSTOMER);

    @Override
    public boolean add(CustomerDTO customerDTO) throws Exception {
        return customerDAO.add(new Customer(
                customerDTO.getId(),
                customerDTO.getFullName(),
                customerDTO.getAddress()
        ));
    }

    @Override
    public boolean update(CustomerDTO customerDTO) throws Exception {
        return customerDAO.update(new Customer(
                customerDTO.getId(),
                customerDTO.getFullName(),
                customerDTO.getAddress()
        ));
    }

    @Override
    public boolean delete(String id) throws Exception {
        return customerDAO.delete(id);
    }

}
