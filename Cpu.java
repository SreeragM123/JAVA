class CPU {
    int price;
    CPU(int p){
        price = p;
    }
    class Processor{
        int no_of_cores;
        String manufacturer;
        Processor(int n, String m){
            no_of_cores = n;
            manufacturer = m;
        }
        void display(){
            System.out.println("Processor Information");
            System.out.println("No. of Cores : "+no_of_cores);
            System.out.println("Manufacturer : "+manufacturer);
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        RAM(int m, String n){
            memory = m;
            manufacturer = n;
        }
        void display(){
            System.out.println("RAM Information");
            System.out.println("Memory : "+memory);
            System.out.println("Manufacturer : "+manufacturer);
        }
    }
    void display(){
        System.out.println("CPU Information");
        System.out.println("Price : "+price);
    }
}

class MCpu {
    public static void main(String[] args) {
        CPU c = new CPU(20000);
        CPU.Processor p = c.new Processor(8,"Intel");
        CPU.RAM r = new CPU.RAM(8,"Intel");
        c.display();
        p.display();
        r.display();
    }
}