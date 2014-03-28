/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.reporting.data.patient.definition;

import org.openmrs.module.reporting.data.BaseDefinitionLibraryDataDefinition;

/**
 * Lets you evaluate a {@link PatientDataDefinition} that is looked up in
 * {@link org.openmrs.module.reporting.definition.library.AllDefinitionLibraries} at evaluation time
 *
 * We intentionally do not define a CachingStrategy since we are just delegating to another definition.
 */
public class DefinitionLibraryPatientDataDefinition extends BaseDefinitionLibraryDataDefinition implements PatientDataDefinition {

    public DefinitionLibraryPatientDataDefinition() {
    }

    public DefinitionLibraryPatientDataDefinition(String definitionKey) {
        setDefinitionKey(definitionKey);
    }

}
