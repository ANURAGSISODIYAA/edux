package de.edux.data.provider;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Dataset {

  double[][] getInputs(List<String[]> dataset, int[] inputColumns);

  double[][] getTargets(List<String[]> dataset, int targetColumn);

  Map<String, Integer> getClassMap();

  double[][] getTrainFeatures(int[] inputColumns);

  double[][] getTrainLabels(int targetColumn);

  double[][] getTestLabels(int targetColumn);

  double[][] getTestFeatures(int[] inputColumns);

  Optional<Integer> getIndexOfColumn(String columnName);

  String[] getColumnDataOf(String columnName);

  String[] getColumnNames();
}
