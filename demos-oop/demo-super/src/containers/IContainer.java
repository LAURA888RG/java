package containers;
import java.util.Set;

import enums.ContainerType;
import products.IProduct;

public interface IContainer {

//Getters
 String getReference();
 int getVolume();
 int getSurface();
 int getResistance();
 ContainerType geType();
 Set<IProduct> getProductos();
 
 //logica negocio
 int volumeDisposable();

 boolean canInsert(IProduct product);
 boolean isResistantTo(IProduct product);

}
