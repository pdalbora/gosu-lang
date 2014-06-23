package gw.specification.types.typeConversion.conversionbetweenPrimitiveTypes

class Errant_ConversionBetweenPrimitiveTest {
  function conversions() {
    var t : boolean = true
    var c : char = 'a';
    var b : byte = 1;
    var s : short = 1;
    var i : int = 1;
    var l : long = 1;
    var f : float = 1.0f;
    var d : double = 1.0;


    var v0 : boolean = t
    var v1 : char = t as char
    var v2 : char = t    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v4 : byte = t as byte
    var v5 : byte = t    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v7 : short = t as short
    var v8 : short = t    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v10 : int = t as int
    var v11 : int = t    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v13 : long = t as long
    var v14 : long = t    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v16 : float = t as float
    var v17 : float = t    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v19 : double = t as double
    var v20 : double = t    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v22 : boolean = c as boolean
    var v23 : boolean = c    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v25 : char = c
    var v26 : byte = c as byte
    var v27 : byte = c    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v29 : short = c as short
    var v30 : short = c    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v32 : int = c
    var v33 : long = c
    var v34 : float = c
    var v35 : double = c
    var v36 : boolean = b as boolean
    var v37 : boolean = b    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v39 : char = b as char
    var v40 : char = b    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v42 : byte = b
    var v43 : short = b
    var v44 : int = b
    var v45 : long = b
    var v46 : float = b
    var v47 : double = b
    var v48 : boolean = s as boolean
    var v49 : boolean = s    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v51 : char = s as char
    var v52 : char = s    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v54 : byte = s as byte
    var v55 : byte = s    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v57 : short = s
    var v58 : int = s
    var v59 : long = s
    var v60 : float = s
    var v61 : double = s
    var v62 : boolean = i as boolean
    var v63 : boolean = i    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v65 : char = i as char
    var v66 : char = i    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v68 : byte = i as byte
    var v69 : byte = i    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v71 : short = i as short
    var v72 : short = i    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v74 : int = i
    var v75 : long = i
    var v76 : float = i
    var v77 : double = i
    var v78 : boolean = l as boolean
    var v79 : boolean = l    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v81 : char = l as char
    var v82 : char = l    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v84 : byte = l as byte
    var v85 : byte = l    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v87 : short = l as short
    var v88 : short = l    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v90 : int = l as int
    var v91 : int = l    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v93 : long = l
    var v94 : float = l
    var v95 : double = l
    var v96 : boolean = f as boolean
    var v97 : boolean = f    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v99 : char = f as char
    var v100 : char = f    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v102 : byte = f as byte
    var v103 : byte = f    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v105 : short = f as short
    var v106 : short = f    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v108 : int = f as int
    var v109 : int = f    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v111 : long = f as long
    var v112 : long = f    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v114 : float = f
    var v115 : double = f
    var v116 : boolean = d as boolean
    var v117 : boolean = d    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v119 : char = d as char
    var v120 : char = d    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v122 : byte = d as byte
    var v123 : byte = d    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v125 : short = d as short
    var v126 : short = d    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v128 : int = d as int
    var v129 : int = d    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v131 : long = d as long
    var v132 : long = d    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v134 : float = d as float
    var v135 : float = d    //## issuekeys: MSG_IMPLICIT_COERCION_ERROR
    var v137 : double = d
  }
}