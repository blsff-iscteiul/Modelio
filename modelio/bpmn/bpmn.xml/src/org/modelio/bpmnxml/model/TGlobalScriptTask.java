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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for tGlobalScriptTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tGlobalScriptTask">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tGlobalTask">
 * &lt;sequence>
 * &lt;element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}script" minOccurs="0"/>
 * &lt;/sequence>
 * &lt;attribute name="scriptLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("036138a3-415f-487d-a8f6-34a1aa443067")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tGlobalScriptTask", propOrder = {
    "script"
})
public class TGlobalScriptTask extends TGlobalTask {
    @objid ("bdcb0e6d-0e33-40af-9b51-f3a0f564b555")
    @XmlAttribute(name = "scriptLanguage")
    @XmlSchemaType(name = "anyURI")
    protected String scriptLanguage;

    @objid ("7266dcb6-1d8e-46c7-834c-ad91a5e3edb0")
    protected TScript script;

    /**
     * Gets the value of the script property.
     * @return
     * possible object is
     * {@link TScript }
     */
    @objid ("fc6050ba-6e50-41f5-9892-22152931e42f")
    public TScript getScript() {
        return this.script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value allowed object is
     * {@link TScript }
     */
    @objid ("798c17e2-267e-4563-ba76-43a357f08d57")
    public void setScript(TScript value) {
        this.script = value;
    }

    /**
     * Gets the value of the scriptLanguage property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("bb78da2c-9860-4db4-95a6-5e9006d1be16")
    public String getScriptLanguage() {
        return this.scriptLanguage;
    }

    /**
     * Sets the value of the scriptLanguage property.
     * 
     * @param value allowed object is
     * {@link String }
     */
    @objid ("0ed58932-ea42-458a-98e8-4f654cb43557")
    public void setScriptLanguage(String value) {
        this.scriptLanguage = value;
    }

}
