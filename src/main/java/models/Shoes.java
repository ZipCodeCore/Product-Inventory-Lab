package models;

public class Shoes {

        private  String name;
        private int quantity;
        private double price;
        //a.need this for testing individual setTests.
        public Shoes () {
                this.name = "NIKE";
                this.quantity = 1000;
                this.price = 20.00;
        }
        public void setName(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public double getPrice() {
                return price;
        }
        //d.
        public Shoes(String name, int quantity, double price) {
                this.name = name;
                this.quantity = quantity;
                this.price = price;
        }


}



