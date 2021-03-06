/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.faces.test.servlet30.renderkit;

import com.sun.faces.test.servlet30.renderkit.SelectMany05Bean.HobbitBean;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped

public class Bean {

    public Bean() {
        passThroughAttrs = new ConcurrentHashMap<String, Object>();
        passThroughAttrs.put("literalName", "literalValue");
        passThroughAttrs.put("elName", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{facesContext.viewRoot.viewId}", String.class));
        
        rendererSpecificAttrs = new ConcurrentHashMap<String, Object>();
        rendererSpecificAttrs.put("styleClass", "a b c");
        rendererSpecificAttrs.put("size", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{bean.one}", Integer.class));
        
    }
    
    private Map<String, Object> passThroughAttrs;
    private Map<String, Object> rendererSpecificAttrs;

    public Map<String, Object> getRendererSpecificAttrs() {
        return rendererSpecificAttrs;
    }

    public Map<String, Object> getPassThroughAttrs() {
        return passThroughAttrs;
    }

    private String nullValue = null;

    public String getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }
    
    public Integer getOne() { return (Integer) 1; }
    
    
    private String fruitValue;

    public String getFruitValue() {
        return fruitValue;
    }

    public void setFruitValue(String stringValue) {
        this.fruitValue = stringValue;
    }
    
    private String nameValue;

    public String getNameValue() {
        return nameValue;
    }
    
    List<String> nameValueList;

    public List<String> getNameValueList() {
        return nameValueList;
    }

    public void setNameValueList(List<String> nameValueList) {
        this.nameValueList = nameValueList;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }
    
    private HobbitBean hobbitBean;

    public HobbitBean getHobbitBean() {
        return hobbitBean;
    }

    public void setHobbitBean(HobbitBean hobbitBean) {
        this.hobbitBean = hobbitBean;
    }
    
    private List<HobbitBean> hobbitBeanList;

    public List<HobbitBean> getHobbitBeanList() {
        return hobbitBeanList;
    }

    public void setHobbitBeanList(List<HobbitBean> hobbitBeanList) {
        this.hobbitBeanList = hobbitBeanList;
    }
    
    
    
    private String groupedNameValue;

    public String getGroupedNameValue() {
        return groupedNameValue;
    }

    public void setGroupedNameValue(String groupedNameValue) {
        this.groupedNameValue = groupedNameValue;
    }
    
    private List<String> groupedNameValueList;

    public List<String> getGroupedNameValueList() {
        return groupedNameValueList;
    }

    public void setGroupedNameValueList(List<String> groupedNameValueList) {
        this.groupedNameValueList = groupedNameValueList;
    }
    
}
