package ppatosca;

import java.util.Random;

/**
 *
 * @author gtbavi
 */
public class Individual {

    private int size;
    private int id;
    private int[] prey;
    private Double survival_value;

    public Individual(int size, int id) {
        this.size = size;
        this.id = id;
        this.prey = new int[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getPrey() {
        return prey;
    }

    public void setPrey(int[] prey) {
        this.prey = prey;
    }

    public Double getSurvival_value() {
        return survival_value;
    }

    public void setSurvival_value(Double survival_value) {
        this.survival_value = survival_value;
    }

    public static int[] generateRandomPrey(int size) {
        int[] prey = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            prey[i] = random.nextInt(2);
        }
        return prey;
    }

    public void generateIndividualTest(int i) {
        switch (i) {
            case 1:
                this.prey = new int[]{1, 1, 1, 0, 0};
                break;
            case 2:
                this.prey = new int[]{0, 1, 1, 1, 0};
                break;
            case 3:
                this.prey = new int[]{0, 1, 1, 0, 1};
                break;
            case 4:
                this.prey = new int[]{0, 1, 0, 1, 1};
                break;
            case 5:
                this.prey = new int[]{0, 1, 0, 0, 0};
                break;
            default:
                this.prey = generateRandomPrey(size);
                
        }
    }
    //TODO utilizar função de fitness pra calcular SV
    public static Double generateSurvivalValue(int[] prey){
        return Double.MAX_VALUE;
    }

}
