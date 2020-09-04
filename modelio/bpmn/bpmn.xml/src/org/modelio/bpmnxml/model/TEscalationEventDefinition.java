/* 
 * Copyright 2013-2019 Modeliosoft
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tEscalationEventDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tEscalationEventDefinition">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tEventDefinition">
 * &lt;attribute name="escalationRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("778ea8cf-2507-4b98-acf8-1c066e4dc59f")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tEscalationEventDefinition")
public class TEscalationEventDefinition extends TEventDefinition {
    @objid ("72c616c6-da8e-4dcc-86b1-eca47732b221")
    @XmlAttribute(name = "escalationRef")
    protected QName escalationRef;

    /**
     * Gets the value of the escalationRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("15e00231-c696-46ec-a211-0b4969dd8359")
    public QName getEscalationRef() {
        return this.escalationRef;
    }

    /**
     * Sets the value of the escalationRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("fba5891a-28aa-410e-8296-8186c6596ce6")
    public void setEscalationRef(QName value) {
        this.escalationRef = value;
    }

}
