// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/entities/v1alpha2/modules.proto

package com.tcn.cloud.api.services.billing.entities.v1alpha2;

public interface BasicUnitConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.billing.entities.v1alpha2.BasicUnitConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. the size of an individual unit. For example, a unit
   * size of 300 (with bytes as a unit of measurement) and an event
   * of size 400 bytes will get billed as if it were 2 units.
   * </pre>
   *
   * <code>int64 unit_size = 1 [json_name = "unitSize"];</code>
   * @return The unitSize.
   */
  long getUnitSize();

  /**
   * <pre>
   * Required. the amount to rate each unit
   * </pre>
   *
   * <code>double rate = 2 [json_name = "rate"];</code>
   * @return The rate.
   */
  double getRate();

  /**
   * <pre>
   * Optional. the minimum number of units to rate; for example, a
   * unit size of 5 seconds and a min_units of 2 would mean that
   * any event less than 10 seconds would be billed as if it were
   * two units (10 seconds). This is per event.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_units = 3 [json_name = "minUnits"];</code>
   * @return Whether the minUnits field is set.
   */
  boolean hasMinUnits();
  /**
   * <pre>
   * Optional. the minimum number of units to rate; for example, a
   * unit size of 5 seconds and a min_units of 2 would mean that
   * any event less than 10 seconds would be billed as if it were
   * two units (10 seconds). This is per event.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_units = 3 [json_name = "minUnits"];</code>
   * @return The minUnits.
   */
  com.google.protobuf.Int64Value getMinUnits();
  /**
   * <pre>
   * Optional. the minimum number of units to rate; for example, a
   * unit size of 5 seconds and a min_units of 2 would mean that
   * any event less than 10 seconds would be billed as if it were
   * two units (10 seconds). This is per event.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_units = 3 [json_name = "minUnits"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMinUnitsOrBuilder();

  /**
   * <pre>
   * Optional. the maximum number of units to rate; for example, a
   * unit size of 5 seconds and a max_units of 2 would mean that
   * any event more than 10 seconds would be billed as if it were
   * two units (10 seconds). This is per event.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_units = 4 [json_name = "maxUnits"];</code>
   * @return Whether the maxUnits field is set.
   */
  boolean hasMaxUnits();
  /**
   * <pre>
   * Optional. the maximum number of units to rate; for example, a
   * unit size of 5 seconds and a max_units of 2 would mean that
   * any event more than 10 seconds would be billed as if it were
   * two units (10 seconds). This is per event.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_units = 4 [json_name = "maxUnits"];</code>
   * @return The maxUnits.
   */
  com.google.protobuf.Int64Value getMaxUnits();
  /**
   * <pre>
   * Optional. the maximum number of units to rate; for example, a
   * unit size of 5 seconds and a max_units of 2 would mean that
   * any event more than 10 seconds would be billed as if it were
   * two units (10 seconds). This is per event.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_units = 4 [json_name = "maxUnits"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMaxUnitsOrBuilder();

  /**
   * <pre>
   * Optional. the minimum number of units to rate per cycle
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_units_per_cycle = 5 [json_name = "minUnitsPerCycle"];</code>
   * @return Whether the minUnitsPerCycle field is set.
   */
  boolean hasMinUnitsPerCycle();
  /**
   * <pre>
   * Optional. the minimum number of units to rate per cycle
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_units_per_cycle = 5 [json_name = "minUnitsPerCycle"];</code>
   * @return The minUnitsPerCycle.
   */
  com.google.protobuf.Int64Value getMinUnitsPerCycle();
  /**
   * <pre>
   * Optional. the minimum number of units to rate per cycle
   * </pre>
   *
   * <code>.google.protobuf.Int64Value min_units_per_cycle = 5 [json_name = "minUnitsPerCycle"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMinUnitsPerCycleOrBuilder();

  /**
   * <pre>
   * Optional. the maximum number of units to rate per cycle
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_units_per_cycle = 6 [json_name = "maxUnitsPerCycle"];</code>
   * @return Whether the maxUnitsPerCycle field is set.
   */
  boolean hasMaxUnitsPerCycle();
  /**
   * <pre>
   * Optional. the maximum number of units to rate per cycle
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_units_per_cycle = 6 [json_name = "maxUnitsPerCycle"];</code>
   * @return The maxUnitsPerCycle.
   */
  com.google.protobuf.Int64Value getMaxUnitsPerCycle();
  /**
   * <pre>
   * Optional. the maximum number of units to rate per cycle
   * </pre>
   *
   * <code>.google.protobuf.Int64Value max_units_per_cycle = 6 [json_name = "maxUnitsPerCycle"];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMaxUnitsPerCycleOrBuilder();
}
