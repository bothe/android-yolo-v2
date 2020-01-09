package org.tensorflow.yolo;

/**
 * Created by Zoltan Szabo on 12/17/17.
 * https://github.com/szaza/android-yolo-v2
 */
public interface Config {
    int INPUT_SIZE = 416;   // The input size. A square image of inputSize x inputSize is assumed.
    String MODEL_FILE = "tiny-yolo-voc-graph.pb";   // The filepath of the model GraphDef protocol buffer.
    String LABEL_FILE = "tiny-yolo-voc-labels.txt"; // The filepath of label file for classes.
    String INPUT_NAME = "input";    // The label of the image input node.
    String OUTPUT_NAME = "output"; // The label of the output node.
    String LOGGING_TAG = "YOLO";
}
