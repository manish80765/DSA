package ML;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.functions.Logistic;

import java.util.Random;

public class SupervisedLearningExample {

    public static void main(String[] args) throws Exception {
        // Load dataset (Iris dataset in ARFF format)
        DataSource source = new DataSource("iris.arff");
        Instances data = source.getDataSet();

        // Set the class index (last attribute is usually the class)
        if (data.classIndex() == -1)
            data.setClassIndex(data.numAttributes() - 1);

        // Create and train classifier (Logistic Regression)
        Classifier classifier = new Logistic();
        classifier.buildClassifier(data);

        // Evaluate the model with 10-fold cross-validation
        Evaluation eval = new Evaluation(data);
        eval.crossValidateModel(classifier, data, 10, new Random(1));

        // Print evaluation results
        System.out.println(eval.toSummaryString("\nResults\n======\n", false));
        System.out.println("Confusion Matrix:");
        double[][] cm = eval.confusionMatrix();
        for (double[] row : cm) {
            for (double val : row) {
                System.out.print((int) val + " ");
            }
            System.out.println();
        }
    }
}
