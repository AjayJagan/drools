/*
 * Copyright 2005 Red Hat, Inc. and/or its affiliates.
 *
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
 */
package org.drools.base.reteoo;

import org.drools.base.rule.Declaration;

import java.util.Comparator;

public class SortDeclarations
        implements
        Comparator<Declaration> {
    public final static SortDeclarations instance = new SortDeclarations();

    public int compare(Declaration d1,
                       Declaration d2) {
        return (d1.getIdentifier().compareTo(d2.getIdentifier()));
    }
}
