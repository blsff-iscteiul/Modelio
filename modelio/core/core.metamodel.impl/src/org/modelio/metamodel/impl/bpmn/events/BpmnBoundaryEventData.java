/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 2.3.00, by Modeliosoft
     Generator version: 3.8.00
     Generated on: Sep 7, 2018
*/
package org.modelio.metamodel.impl.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0087c49a-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnBoundaryEventData extends BpmnCatchEventData {
    @objid ("03d5e7db-b39b-4d6f-ae3d-fda664af4910")
     Object mCancelActivity = false;

    @objid ("5c0f402e-673c-4a8b-822f-0a0c0b986224")
     SmObjectImpl mAttachedToRef;

    @objid ("73edf68e-c10e-4dad-b6d9-23be16971cac")
    public BpmnBoundaryEventData(BpmnBoundaryEventSmClass smClass) {
        super(smClass);
    }

}
