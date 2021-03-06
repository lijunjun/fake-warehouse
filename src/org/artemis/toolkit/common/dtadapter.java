/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.artemis.toolkit.common;

import java.lang.reflect.Type;

import org.artemis.toolkit.table.newdatatype;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * dtadapter data type adapter for Gson
 * dtadapter.java is written at Jun 15, 2014
 * @author return_jun
 * @since 0.2
 */
class dtSerializer implements JsonSerializer<newdatatype> {

	@Override
	public JsonElement serialize(newdatatype src, Type typeOfSrc,
			JsonSerializationContext context) {
		return new JsonPrimitive(src.value());
	}
	
}

class dtDeserializer implements JsonDeserializer<newdatatype> {

	@Override
	public newdatatype deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		return newdatatype.fromString(json.getAsJsonPrimitive().getAsString());
	}
	
}
