package beans;

import java.util.*;

import org.springframework.stereotype.Service;
@Service  
public class ProductService implements IProductService {

	List <Product> props;
	@Override
	public List<Product> findAll() {
	 props=new ArrayList();
	props.add(new Product(101,"lux", 189));
	props.add(new Product(102,"mysoresandal", 200));
	props.add(new Product(103,"lifeboy", 189));
	props.add(new Product(104,"rexona", 290));
	return props;
	}

	@Override
	public Product getProduct(int id) {
		
	for(Product p:props)
	{
	if(p.pid==id)
	{
	return p;	
	}
	
	}
	return new  Product();
	}
	

}
