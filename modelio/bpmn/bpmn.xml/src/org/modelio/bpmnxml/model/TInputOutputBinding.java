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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tInputOutputBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tInputOutputBinding">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 * &lt;attribute name="operationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;attribute name="inputDataRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 * &lt;attribute name="outputDataRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("9d05f6b3-9733-4f3e-b758-1c6849f43981")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInputOutputBinding")
public class TInputOutputBinding extends TBaseElement {
    @objid ("8a0c3c92-8ce6-4dd3-bc11-d45c7b01dbc2")
    @XmlAttribute(name = "operationRef", required = true)
    protected QName operationRef;

    @objid ("54202a8d-6cc4-468f-bd27-49cd98746fd7")
    @XmlAttribute(name = "inputDataRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object inputDataRef;

    @objid ("2fc67ddb-5884-49ff-ab73-0dc2a36d7856")
    @XmlAttribute(name = "outputDataRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object outputDataRef;

    /**
     * Gets the value of the operationRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("9c18c619-58ed-401a-a8db-f6decc854072")
    public QName getOperationRef() {
        return this.operationRef;
    }

    /**
     * Sets the value of the operationRef property.
     * 
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("34d19301-2ed1-4053-9f05-14e561a2f8ee")
    public void setOperationRef(QName value) {
        this.operationRef = value;
    }

    /**
     * Gets the value of the inputDataRef property.
     * @return
     * possible object is
     * {@link Object }
     */
    @objid ("31e37a7e-3bff-4bfa-8bf2-7f6e0ab76df2")
    public Object getInputDataRef() {
        return this.inputDataRef;
    }

    /**
     * Sets the value of the inputDataRef property.
     * 
     * @param value allowed object is
     * {@link Object }
     */
    @objid ("e2a2bd26-cbd9-4f98-abb1-73fff02dede2")
    public void setInputDataRef(Object value) {
        this.inputDataRef = value;
    }

    /**
     * Gets the value of the outputDataRef property.
     * @return
     * possible object is
     * {@link Object }
     */
    @objid ("3d880b86-337c-4278-b9e9-e5c5afab4d9b")
    public Object getOutputDataRef() {
        return this.outputDataRef;
    }

    /**
     * Sets the value of the outputDataRef property.
     * 
     * @param value allowed object is
     * {@link Object }
     */
    @objid ("cdeecf11-5ce6-415d-ba40-c1c1edd64ce3")
    public void setOutputDataRef(Object value) {
        this.outputDataRef = value;
    }

}
