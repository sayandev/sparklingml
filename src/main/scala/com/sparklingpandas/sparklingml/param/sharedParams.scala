/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sparklingpandas.sparklingml.param

import org.apache.spark.ml.param._

// DO NOT MODIFY THIS FILE! It was generated by SharedParamsCodeGen.

// scalastyle:off

/**
 * Trait for shared param stopwordCase (default: false).
 */
trait HasStopwordCase extends Params {

  /**
   * Param for If the case should be considered when filtering stopwords.
   * @group param
   */
  final val stopwordCase: BooleanParam = new BooleanParam(this, "stopwordCase", "If the case should be considered when filtering stopwords")

  setDefault(stopwordCase, false)

  /** @group getParam */
  final def getStopwordCase: Boolean = $(stopwordCase)

  final def setStopwordCase(value: Boolean): this.type = set(this.stopwordCase, value)
}

/**
 * Trait for shared param stopwords.
 */
trait HasStopwords extends Params {

  /**
   * Param for Stopwords to be filtered. Default value depends on underlying transformer.
   * @group param
   */
  final val stopwords: StringArrayParam = new StringArrayParam(this, "stopwords", "Stopwords to be filtered. Default value depends on underlying transformer")

  /** @group getParam */
  final def getStopwords: Array[String] = $(stopwords)

  final def setStopwords(value: Array[String]): this.type = set(this.stopwords, value)
}

/**
 * Trait for shared param regParam.
 */
trait HasRegParam extends Params {

  /**
   * Param for regularization parameter (&gt;= 0).
   * @group param
   */
  final val regParam: DoubleParam = new DoubleParam(this, "regParam", "regularization parameter (>= 0)", ParamValidators.gtEq(0))

  /** @group getParam */
  final def getRegParam: Double = $(regParam)

  final def setRegParam(value: Double): this.type = set(this.regParam, value)
}

/**
 * Trait for shared param maxIter.
 */
trait HasMaxIter extends Params {

  /**
   * Param for maximum number of iterations (&gt;= 0).
   * @group param
   */
  final val maxIter: IntParam = new IntParam(this, "maxIter", "maximum number of iterations (>= 0)", ParamValidators.gtEq(0))

  /** @group getParam */
  final def getMaxIter: Int = $(maxIter)

  final def setMaxIter(value: Int): this.type = set(this.maxIter, value)
}

/**
 * Trait for shared param featuresCol (default: "features").
 */
trait HasFeaturesCol extends Params {

  /**
   * Param for features column name.
   * @group param
   */
  final val featuresCol: Param[String] = new Param[String](this, "featuresCol", "features column name")

  setDefault(featuresCol, "features")

  /** @group getParam */
  final def getFeaturesCol: String = $(featuresCol)

  final def setFeaturesCol(value: String): this.type = set(this.featuresCol, value)
}

/**
 * Trait for shared param labelCol (default: "label").
 */
trait HasLabelCol extends Params {

  /**
   * Param for label column name.
   * @group param
   */
  final val labelCol: Param[String] = new Param[String](this, "labelCol", "label column name")

  setDefault(labelCol, "label")

  /** @group getParam */
  final def getLabelCol: String = $(labelCol)

  final def setLabelCol(value: String): this.type = set(this.labelCol, value)
}

/**
 * Trait for shared param predictionCol (default: "prediction").
 */
trait HasPredictionCol extends Params {

  /**
   * Param for prediction column name.
   * @group param
   */
  final val predictionCol: Param[String] = new Param[String](this, "predictionCol", "prediction column name")

  setDefault(predictionCol, "prediction")

  /** @group getParam */
  final def getPredictionCol: String = $(predictionCol)

  final def setPredictionCol(value: String): this.type = set(this.predictionCol, value)
}

/**
 * Trait for shared param rawPredictionCol (default: "rawPrediction").
 */
trait HasRawPredictionCol extends Params {

  /**
   * Param for raw prediction (a.k.a. confidence) column name.
   * @group param
   */
  final val rawPredictionCol: Param[String] = new Param[String](this, "rawPredictionCol", "raw prediction (a.k.a. confidence) column name")

  setDefault(rawPredictionCol, "rawPrediction")

  /** @group getParam */
  final def getRawPredictionCol: String = $(rawPredictionCol)

  final def setRawPredictionCol(value: String): this.type = set(this.rawPredictionCol, value)
}

/**
 * Trait for shared param probabilityCol (default: "probability").
 */
trait HasProbabilityCol extends Params {

  /**
   * Param for Column name for predicted class conditional probabilities. Note: Not all models output well-calibrated probability estimates! These probabilities should be treated as confidences, not precise probabilities.
   * @group param
   */
  final val probabilityCol: Param[String] = new Param[String](this, "probabilityCol", "Column name for predicted class conditional probabilities. Note: Not all models output well-calibrated probability estimates! These probabilities should be treated as confidences, not precise probabilities")

  setDefault(probabilityCol, "probability")

  /** @group getParam */
  final def getProbabilityCol: String = $(probabilityCol)

  final def setProbabilityCol(value: String): this.type = set(this.probabilityCol, value)
}

/**
 * Trait for shared param varianceCol.
 */
trait HasVarianceCol extends Params {

  /**
   * Param for Column name for the biased sample variance of prediction.
   * @group param
   */
  final val varianceCol: Param[String] = new Param[String](this, "varianceCol", "Column name for the biased sample variance of prediction")

  /** @group getParam */
  final def getVarianceCol: String = $(varianceCol)

  final def setVarianceCol(value: String): this.type = set(this.varianceCol, value)
}

/**
 * Trait for shared param threshold (default: 0.5).
 */
trait HasThreshold extends Params {

  /**
   * Param for threshold in binary classification prediction, in range [0, 1].
   * @group param
   */
  final val threshold: DoubleParam = new DoubleParam(this, "threshold", "threshold in binary classification prediction, in range [0, 1]", ParamValidators.inRange(0, 1))

  setDefault(threshold, 0.5)

  /** @group getParam */
  def getThreshold: Double = $(threshold)

  def setThreshold(value: Double): this.type = set(this.threshold, value)
}

/**
 * Trait for shared param thresholds.
 */
trait HasThresholds extends Params {

  /**
   * Param for Thresholds in multi-class classification to adjust the probability of predicting each class. Array must have length equal to the number of classes, with values &gt; 0 excepting that at most one value may be 0. The class with largest value p/t is predicted, where p is the original probability of that class and t is the class's threshold.
   * @group param
   */
  final val thresholds: DoubleArrayParam = new DoubleArrayParam(this, "thresholds", "Thresholds in multi-class classification to adjust the probability of predicting each class. Array must have length equal to the number of classes, with values > 0 excepting that at most one value may be 0. The class with largest value p/t is predicted, where p is the original probability of that class and t is the class's threshold", (t: Array[Double]) => t.forall(_ >= 0) && t.count(_ == 0) <= 1)

  /** @group getParam */
  def getThresholds: Array[Double] = $(thresholds)

  def setThresholds(value: Array[Double]): this.type = set(this.thresholds, value)
}

/**
 * Trait for shared param inputCol.
 */
trait HasInputCol extends Params {

  /**
   * Param for input column name.
   * @group param
   */
  final val inputCol: Param[String] = new Param[String](this, "inputCol", "input column name")

  /** @group getParam */
  final def getInputCol: String = $(inputCol)

  final def setInputCol(value: String): this.type = set(this.inputCol, value)
}

/**
 * Trait for shared param inputCols.
 */
trait HasInputCols extends Params {

  /**
   * Param for input column names.
   * @group param
   */
  final val inputCols: StringArrayParam = new StringArrayParam(this, "inputCols", "input column names")

  /** @group getParam */
  final def getInputCols: Array[String] = $(inputCols)

  final def setInputCols(value: Array[String]): this.type = set(this.inputCols, value)
}

/**
 * Trait for shared param outputCol (default: uid + "__output").
 */
trait HasOutputCol extends Params {

  /**
   * Param for output column name.
   * @group param
   */
  final val outputCol: Param[String] = new Param[String](this, "outputCol", "output column name")

  setDefault(outputCol, uid + "__output")

  /** @group getParam */
  final def getOutputCol: String = $(outputCol)

  final def setOutputCol(value: String): this.type = set(this.outputCol, value)
}

/**
 * Trait for shared param checkpointInterval.
 */
trait HasCheckpointInterval extends Params {

  /**
   * Param for set checkpoint interval (&gt;= 1) or disable checkpoint (-1). E.g. 10 means that the cache will get checkpointed every 10 iterations.
   * @group param
   */
  final val checkpointInterval: IntParam = new IntParam(this, "checkpointInterval", "set checkpoint interval (>= 1) or disable checkpoint (-1). E.g. 10 means that the cache will get checkpointed every 10 iterations", (interval: Int) => interval == -1 || interval >= 1)

  /** @group getParam */
  final def getCheckpointInterval: Int = $(checkpointInterval)

  final def setCheckpointInterval(value: Int): this.type = set(this.checkpointInterval, value)
}

/**
 * Trait for shared param fitIntercept (default: true).
 */
trait HasFitIntercept extends Params {

  /**
   * Param for whether to fit an intercept term.
   * @group param
   */
  final val fitIntercept: BooleanParam = new BooleanParam(this, "fitIntercept", "whether to fit an intercept term")

  setDefault(fitIntercept, true)

  /** @group getParam */
  final def getFitIntercept: Boolean = $(fitIntercept)

  final def setFitIntercept(value: Boolean): this.type = set(this.fitIntercept, value)
}

/**
 * Trait for shared param handleInvalid.
 */
trait HasHandleInvalid extends Params {

  /**
   * Param for how to handle invalid entries. Options are skip (which will filter out rows with bad values), or error (which will throw an error). More options may be added later.
   * @group param
   */
  final val handleInvalid: Param[String] = new Param[String](this, "handleInvalid", "how to handle invalid entries. Options are skip (which will filter out rows with bad values), or error (which will throw an error). More options may be added later", ParamValidators.inArray(Array("skip", "error")))

  /** @group getParam */
  final def getHandleInvalid: String = $(handleInvalid)

  final def setHandleInvalid(value: String): this.type = set(this.handleInvalid, value)
}

/**
 * Trait for shared param standardization (default: true).
 */
trait HasStandardization extends Params {

  /**
   * Param for whether to standardize the training features before fitting the model.
   * @group param
   */
  final val standardization: BooleanParam = new BooleanParam(this, "standardization", "whether to standardize the training features before fitting the model")

  setDefault(standardization, true)

  /** @group getParam */
  final def getStandardization: Boolean = $(standardization)

  final def setStandardization(value: Boolean): this.type = set(this.standardization, value)
}

/**
 * Trait for shared param seed (default: this.getClass.getName.hashCode.toLong).
 */
trait HasSeed extends Params {

  /**
   * Param for random seed.
   * @group param
   */
  final val seed: LongParam = new LongParam(this, "seed", "random seed")

  setDefault(seed, this.getClass.getName.hashCode.toLong)

  /** @group getParam */
  final def getSeed: Long = $(seed)

  final def setSeed(value: Long): this.type = set(this.seed, value)
}

/**
 * Trait for shared param elasticNetParam.
 */
trait HasElasticNetParam extends Params {

  /**
   * Param for the ElasticNet mixing parameter, in range [0, 1]. For alpha = 0, the penalty is an L2 penalty. For alpha = 1, it is an L1 penalty.
   * @group param
   */
  final val elasticNetParam: DoubleParam = new DoubleParam(this, "elasticNetParam", "the ElasticNet mixing parameter, in range [0, 1]. For alpha = 0, the penalty is an L2 penalty. For alpha = 1, it is an L1 penalty", ParamValidators.inRange(0, 1))

  /** @group getParam */
  final def getElasticNetParam: Double = $(elasticNetParam)

  final def setElasticNetParam(value: Double): this.type = set(this.elasticNetParam, value)
}

/**
 * Trait for shared param tol.
 */
trait HasTol extends Params {

  /**
   * Param for the convergence tolerance for iterative algorithms (&gt;= 0).
   * @group param
   */
  final val tol: DoubleParam = new DoubleParam(this, "tol", "the convergence tolerance for iterative algorithms (>= 0)", ParamValidators.gtEq(0))

  /** @group getParam */
  final def getTol: Double = $(tol)

  final def setTol(value: Double): this.type = set(this.tol, value)
}

/**
 * Trait for shared param stepSize.
 */
trait HasStepSize extends Params {

  /**
   * Param for Step size to be used for each iteration of optimization (&gt; 0).
   * @group param
   */
  final val stepSize: DoubleParam = new DoubleParam(this, "stepSize", "Step size to be used for each iteration of optimization (> 0)", ParamValidators.gt(0))

  /** @group getParam */
  final def getStepSize: Double = $(stepSize)

  final def setStepSize(value: Double): this.type = set(this.stepSize, value)
}

/**
 * Trait for shared param weightCol.
 */
trait HasWeightCol extends Params {

  /**
   * Param for weight column name. If this is not set or empty, we treat all instance weights as 1.0.
   * @group param
   */
  final val weightCol: Param[String] = new Param[String](this, "weightCol", "weight column name. If this is not set or empty, we treat all instance weights as 1.0")

  /** @group getParam */
  final def getWeightCol: String = $(weightCol)

  final def setWeightCol(value: String): this.type = set(this.weightCol, value)
}

/**
 * Trait for shared param solver.
 */
trait HasSolver extends Params {

  /**
   * Param for the solver algorithm for optimization.
   * @group param
   */
  val solver: Param[String] = new Param[String](this, "solver", "the solver algorithm for optimization")

  /** @group getParam */
  final def getSolver: String = $(solver)

  final def setSolver(value: String): this.type = set(this.solver, value)
}

/**
 * Trait for shared param aggregationDepth (default: 2).
 */
trait HasAggregationDepth extends Params {

  /**
   * Param for suggested depth for treeAggregate (&gt;= 2).
   * @group expertParam
   */
  final val aggregationDepth: IntParam = new IntParam(this, "aggregationDepth", "suggested depth for treeAggregate (>= 2)", ParamValidators.gtEq(2))

  setDefault(aggregationDepth, 2)

  /** @group expertGetParam */
  final def getAggregationDepth: Int = $(aggregationDepth)

  final def setAggregationDepth(value: Int): this.type = set(this.aggregationDepth, value)
}
// scalastyle:on
