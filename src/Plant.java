public class Plant extends Cell{
    public String colour, name;

    public String toString(){
        return "Plant {" +
                "colour = " + this.colour +
                ", name = " + this.name +
                ", type = " + this.type +
                ", solubility = " + this.solubility + " } ";
    }
}
