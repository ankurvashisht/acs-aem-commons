/*
 * #%L
 * ACS AEM Commons Bundle
 * %%
 * Copyright (C) 2013 Adobe
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.adobe.acs.commons.quickly.results.impl.lists;

import com.adobe.acs.commons.quickly.results.Result;
import com.adobe.acs.commons.quickly.results.Action;

import java.util.ArrayList;
import java.util.List;

public class DevConsoleResults {

    public static final List<Result> getResults() {
        List<Result> results = new ArrayList<Result>();

        results.add(new Result.Builder("crxde")
                .description("CRXDE Lite")
                .path("/crxde")
                .action(new Action.Builder().uri("/crx/de/index.jsp").build())
                .dev()
                .build());

        return results;
    }

}
