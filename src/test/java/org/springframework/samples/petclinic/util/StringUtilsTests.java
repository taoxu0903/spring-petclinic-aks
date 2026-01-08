/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test class for {@link StringUtils}.
 *
 * @author Copilot
 */
class StringUtilsTests {

	@Test
	void capitalizeFirstShouldCapitalizeFirstLetter() {
		assertThat(StringUtils.capitalizeFirst("hello")).isEqualTo("Hello");
		assertThat(StringUtils.capitalizeFirst("world")).isEqualTo("World");
	}

	@Test
	void capitalizeFirstShouldHandleEmptyString() {
		assertThat(StringUtils.capitalizeFirst("")).isEqualTo("");
	}

	@Test
	void capitalizeFirstShouldHandleNull() {
		assertThat(StringUtils.capitalizeFirst(null)).isNull();
	}

	@Test
	void capitalizeFirstShouldHandleSingleCharacter() {
		assertThat(StringUtils.capitalizeFirst("a")).isEqualTo("A");
	}

	@Test
	void capitalizeFirstShouldNotChangeAlreadyCapitalized() {
		assertThat(StringUtils.capitalizeFirst("Hello")).isEqualTo("Hello");
	}

}
