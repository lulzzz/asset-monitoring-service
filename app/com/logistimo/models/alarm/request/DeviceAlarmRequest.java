/*
 * Copyright © 2017 Logistimo.
 *
 * This file is part of Logistimo.
 *
 * Logistimo software is a mobile & web platform for supply chain management and remote temperature monitoring in
 * low-resource settings, made available under the terms of the GNU Affero General Public License (AGPL).
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 * You can be released from the requirements of the license by purchasing a commercial license. To know more about
 * the commercial license, please contact us at opensource@logistimo.com
 */

package com.logistimo.models.alarm.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.validation.Valid;

/**
 * Created by kaniyarasu on 30/10/14.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceAlarmRequest {
  @Valid
  public DeviceConnectionAlarmsRequest dCon;

  @Valid
  public ExternalSensorAlarmsRequest xSns;

  @Valid
  public BatteryAlarmsRequest batt;

  @Valid
  public GenericAlarmRequest iAct;

  @Valid
  public GenericAlarmRequest poa;

  @Valid
  public List<DeviceErrorRequest> errs;


  public DeviceAlarmRequest(GenericAlarmRequest genericAlarmRequest) {
    this.iAct = genericAlarmRequest;
  }

  public DeviceAlarmRequest() {

  }
}
