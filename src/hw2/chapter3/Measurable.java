package hw2.chapter3;

public interface Measurable {

    double getMeasure();

     static double average(Measurable[] objects) {
        double avg = 0;
        for (Measurable item : objects) {
            avg += item.getMeasure();
        }
        return avg / objects.length;
    }

    static Measurable largest(Measurable[] objects) {
        int maxMeasure = 0;
        for (int i = 1; i < objects.length; ++i) {
            if (objects[i].getMeasure() > objects[i-1].getMeasure()) {
                maxMeasure = i;
            }
        }
        return objects[maxMeasure];
    }
}

