package containers;
import java.util.Set;

import enums.ContainerType;
import products.IProduct;

public interface IContainer {

//Getters
 String getReference();
// int getResistance();
 ContainerType getType();
 Set<IProduct> getProducts();

 //propiedades calculadas
 
 int calculateSurface();
 int calculateVolume();
 
 //logica negocio 
 int volumeDisposable();
 
 boolean canInsert(IProduct product);
 boolean isResistantTo(IProduct product);

}
