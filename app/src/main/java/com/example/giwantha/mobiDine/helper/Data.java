package com.example.giwantha.mobiDine.helper;

import com.example.giwantha.mobiDine.model.Category;
import com.example.giwantha.mobiDine.model.Offer;
import com.example.giwantha.mobiDine.model.Product;

import java.util.ArrayList;
import java.util.List;



public class Data {
    List<Category> categoryList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> newList = new ArrayList<>();
    List<Product> popularList = new ArrayList<>();
    List<Offer> offerList = new ArrayList<>();

    public List<Category> getCategoryList() {
        Category category = new Category("1", "Snacks and burgers", "https://media.istockphoto.com/vectors/vector-hamburger-icon-fast-food-sign-burger-symbol-vector-id492541870");
        categoryList.add(category);
        category = new Category("2", "Beverages", "http://getdrawings.com/free-icon/drink-icon-png-57.png");
        categoryList.add(category);

        return categoryList;
    }

    public List<Product> getProductList() {
        Product product = new Product("1", "1", "Regular Chicken Bucket", "KFC", "1 pack ", "Rs.", "200", "10% OFF", "https://www.manilacakeshop.com/images/detailed/6/kfc-12-chicken.jpg?t=1544681738");
        productList.add(product);
        product = new Product("2", "1", "Sawan", "Burger King", "1", "Rs.", "100", "20% OFF", "https://d3dz4rogqkqh6r.cloudfront.net/uploads/files/2015/09/yimg_biks3b-640x426.jpg");
        productList.add(product);
        product = new Product("3", "1", "Chicken Fried Rice", "KCC World Spice", "1", "Rs.", "500", "", "https://img.taste.com.au/VNgrMNnn/w720-h480-cfill-q80/taste/2016/11/chicken-fried-rice-28524-1.jpeg");
        productList.add(product);
        product = new Product("4", "1", "Stuffed Crust Pizza", "Pizza Hut", "1 Piece", "Rs.", "1000", "", "https://www.chewboom.com/wp-content/uploads/2018/04/Pizza-Hut-Introduces-New-Double-Cheesy-Crust-Pan-Pizza-678x381.jpg");
        productList.add(product);
        product = new Product("5", "2", "Virgin Mojito", "KFC", "1", "Rs.", "330", "10% OFF", "http://3.bp.blogspot.com/-5D3wG7loFHY/VC0cLJ-PTCI/AAAAAAAAEAI/5eKoGPOePE0/s1600/807262011111001.jpg");
        productList.add(product);
        product = new Product("6", "2", "Coca Cola", "Pizza Hut", "1500 ml", "Rs.", "300", "", "https://pizzahut.mu/wp-content/uploads/2018/05/Cola.png");
        productList.add(product);
        product = new Product("7", "2", "Pepsi", "KFC", "1500 ml", "Rs.", "300", "", "https://vignette.wikia.nocookie.net/kfc/images/1/19/Drinks_pepsi_can.jpg/revision/latest?cb=20160228014022");
        productList.add(product);

        return productList;
    }

    public List<Product> getNewList() {
        Product product = new Product("1", "1", "Regular Chicken Bucket", "KFC", "1 pack ", "Rs.", "200", "10% OFF", "https://www.manilacakeshop.com/images/detailed/6/kfc-12-chicken.jpg?t=1544681738");
        newList.add(product);
        product = new Product("2", "1", "Sawan", "Burger King", "1", "Rs.", "100", "20% OFF", "https://d3dz4rogqkqh6r.cloudfront.net/uploads/files/2015/09/yimg_biks3b-640x426.jpg");
        newList.add(product);
        product = new Product("3", "1", "Chicken Fried Rice", "KCC World Spice", "1", "Rs.", "500", "", "https://img.taste.com.au/VNgrMNnn/w720-h480-cfill-q80/taste/2016/11/chicken-fried-rice-28524-1.jpeg");
        newList.add(product);
        product = new Product("4", "1", "Stuffed Crust Pizza", "Pizza Hut", "1 Piece", "Rs.", "1000", "", "https://www.chewboom.com/wp-content/uploads/2018/04/Pizza-Hut-Introduces-New-Double-Cheesy-Crust-Pan-Pizza-678x381.jpg");
        newList.add(product);
        product = new Product("5", "2", "Virgin Mojito", "KFC", "1", "Rs.", "330", "10% OFF", "http://3.bp.blogspot.com/-5D3wG7loFHY/VC0cLJ-PTCI/AAAAAAAAEAI/5eKoGPOePE0/s1600/807262011111001.jpg");
        newList.add(product);
        product = new Product("6", "2", "Coca Cola", "Pizza Hut", "1500 ml", "Rs.", "300", "", "https://pizzahut.mu/wp-content/uploads/2018/05/Cola.png");
        newList.add(product);
        product = new Product("7", "2", "Pepsi", "KFC", "1500 ml", "Rs.", "300", "", "https://vignette.wikia.nocookie.net/kfc/images/1/19/Drinks_pepsi_can.jpg/revision/latest?cb=20160228014022");
        newList.add(product);
        return newList;
    }

    public List<Product> getPopularList() {
        Product product = new Product("1", "1", "Regular Chicken Bucket", "KFC", "1 pack ", "Rs.", "200", "10% OFF", "https://www.manilacakeshop.com/images/detailed/6/kfc-12-chicken.jpg?t=1544681738");
        popularList.add(product);
        product = new Product("2", "1", "Sawan", "Burger King", "1", "Rs.", "100", "20% OFF", "https://d3dz4rogqkqh6r.cloudfront.net/uploads/files/2015/09/yimg_biks3b-640x426.jpg");
        popularList.add(product);
        product = new Product("3", "1", "Chicken Fried Rice", "KCC World Spice", "1", "Rs.", "500", "", "https://img.taste.com.au/VNgrMNnn/w720-h480-cfill-q80/taste/2016/11/chicken-fried-rice-28524-1.jpeg");
        popularList.add(product);
        product = new Product("4", "1", "Stuffed Crust Pizza", "Pizza Hut", "1 Piece", "Rs.", "1000", "", "https://www.chewboom.com/wp-content/uploads/2018/04/Pizza-Hut-Introduces-New-Double-Cheesy-Crust-Pan-Pizza-678x381.jpg");
        popularList.add(product);
        product = new Product("5", "2", "Virgin Mojito", "KFC", "1", "Rs.", "330", "10% OFF", "http://3.bp.blogspot.com/-5D3wG7loFHY/VC0cLJ-PTCI/AAAAAAAAEAI/5eKoGPOePE0/s1600/807262011111001.jpg");
        popularList.add(product);
        product = new Product("6", "2", "Coca Cola", "Pizza Hut", "1500 ml", "Rs.", "300", "", "https://pizzahut.mu/wp-content/uploads/2018/05/Cola.png");
        popularList.add(product);
        product = new Product("7", "2", "Pepsi", "KFC", "1500 ml", "Rs.", "300", "", "https://vignette.wikia.nocookie.net/kfc/images/1/19/Drinks_pepsi_can.jpg/revision/latest?cb=20160228014022");
        popularList.add(product);
        return popularList;
    }

    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQm3XhVBjfwQPltOkJLUr2zY27W_z3clwArEGSRVFnh5IOz0Q5M");
        offerList.add(offer);
        offer = new Offer("https://b.zmtcdn.com/data/menus/955/5800955/79046a0774cc086bb9908663103591b6.jpeg");
        offerList.add(offer);
        offer = new Offer("http://synergyy.com/wp-content/uploads/2012/05/50-off-on-12-Pc-Bucket-from-KFC-Srilanka.jpg");
        offerList.add(offer);


        return offerList;
    }
}
