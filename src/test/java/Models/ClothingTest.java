package Models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;


class ClothingTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testSetName(){
        //Given
        String expectedName ="Jean";
        //When
        Clothing clothing =new Clothing();
        clothing.setName(expectedName);
        //Then
        Assertions.assertEquals(expectedName,clothing.getName());


    }

    @Test
    public void testConstructor(){
        //Given
        int id=112;
        String expectedName ="Jean";
        String brand="Levis";
        int size=6;
        int quantity=10;
        float price=35;
        //When
        Clothing clothing =new Clothing(id,expectedName,brand,size,quantity,price);
        //clothing.setName(expectedName);
        //Then
        Assertions.assertEquals(expectedName,clothing.getName());
        Assertions.assertEquals(id,clothing.getId());
        Assertions.assertEquals(brand,clothing.getBrand());
        Assertions.assertEquals(size,clothing.getSize());
        Assertions.assertEquals(quantity,clothing.getQuantity());
        Assertions.assertEquals(price,clothing.getPrice());



    }
}