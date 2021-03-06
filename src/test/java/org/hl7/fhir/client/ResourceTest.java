/*
Copyright (c) 2011-2013, HL7, Inc
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this 
   list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimer in the documentation 
   and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to 
   endorse or promote products derived from this software without specific 
   prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.

*/
package org.hl7.fhir.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.hl7.fhir.instance.formats.JsonComposer;
import org.hl7.fhir.instance.formats.JsonParser;
import org.hl7.fhir.instance.formats.Parser;
import org.hl7.fhir.instance.formats.XmlComposer;
import org.hl7.fhir.instance.formats.XmlParser;
import org.hl7.fhir.instance.formats.ParserBase.ResourceOrFeed;
import org.hl7.fhir.instance.model.Resource;

public class ResourceTest {

  private File source;
  private boolean json;

  public File getSource() {
    return source;
  }

  public void setSource(File source) {
    this.source = source;
  }
  
/*  public void test() throws Exception {
    
    Parser p;
    if (isJson())
      p = new JsonParser();
    else
      p = new XmlParser(false);
    ResourceOrFeed rf = p.parseGeneral(new FileInputStream(source));

    FileOutputStream out = new FileOutputStream(source.getAbsoluteFile()+".out.json");
    JsonComposer json1 = new JsonComposer();
    if (rf.getFeed() != null) 
      json1.compose(out, rf.getFeed(), true);
    else
      json1.compose(out, rf.getResource(), true);

    JsonParser json = new JsonParser();
    rf = json.parseGeneral(new FileInputStream(source.getAbsoluteFile()+".out.json"));
    
    out = new FileOutputStream(source.getAbsoluteFile()+".out.xml");
    if (rf.getFeed() != null) {
    	XmlComposer atom = new XmlComposer(); 
      atom.compose(out, rf.getFeed(), true);
    } else {
      XmlComposer xml1 = new XmlComposer();
      xml1.compose(out, rf.getResource(), true);
    }
    
    
  }

  public boolean isJson() {
    return json;
  }

  public void setJson(boolean json) {
    this.json = json;
  }*/
}
