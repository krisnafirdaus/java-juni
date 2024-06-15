class Animal {
    public void sound() {
        System.out.println("Animal make a sounds");
    }
}

class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("change");
    }
}


