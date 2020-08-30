package Mypackage;

public class Squares {

        // having a lambda taking two arguments can be replaced with method reference
        int side_length;

        public Squares(int side_length) {
            this.side_length = side_length;
        }

        public int area(){
            int squared = side_length*side_length;
            return squared;
        }

    }

