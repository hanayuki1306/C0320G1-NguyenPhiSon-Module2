package Java_Class_and_Object.Bai_Tap.Giai_pt_bac_2;



// pt co dang ax2 + bx + c = 0
// delta = b2 - 4ac.
public class GiaiPtBac2 {

    public static void main(String[] args) {
        value_input input = new value_input(2,3,4);
        System.out.println(input.get_delta());
        input.process();
    }



    public static class value_input {
        int a;
        int b;
        int c;
        public value_input() {
        }

        public value_input(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double get_delta(){
            double delta;
            delta = b*b- 4*a*c;
            return delta;
        }
        public void process(){
            double x1 = 0;
            double x2;
            double delta = this.get_delta();
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta==0){
                x1 = b/(2*a);
                System.out.println("Phuong trinh co 2 nghiem x1 = x2 = " + x1);
            } else if (delta > 0){
                System.out.println("Phuong trinh co 2 nghiem khac nhau  = -b+ can2delta/2a");
            }
        }

    }


    };
//}

