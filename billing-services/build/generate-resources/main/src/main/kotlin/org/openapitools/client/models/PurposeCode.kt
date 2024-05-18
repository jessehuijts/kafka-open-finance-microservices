/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * ExternalPurpose1Code from ISO 20022.  Values from ISO 20022 External Code List ExternalCodeSets_1Q2018 June 2018. 
 *
 * Values: BKDF,BKFE,BKFM,BKIP,BKPP,CBLK,CDCB,CDCD,CDCS,CDDP,CDOC,CDQC,ETUP,FCOL,MTUP,ACCT,CASH,COLL,CSDB,DEPT,INTC,LIMA,NETT,BFWD,CCIR,CCPC,CCPM,CCSM,CRDS,CRPR,CRSP,CRTL,EQPT,EQUS,EXPT,EXTD,FIXI,FWBC,FWCC,FWSB,FWSC,MARG,MBSB,MBSC,MGCC,MGSC,OCCC,OPBC,OPCC,OPSB,OPSC,OPTN,OTCD,REPO,RPBC,RPCC,RPSB,RPSC,RVPO,SBSC,SCIE,SCIR,SCRP,SHBC,SHCC,SHSL,SLEB,SLOA,SWBC,SWCC,SWPT,SWSB,SWSC,TBAS,TBBC,TBCC,TRCP,AGRT,AREN,BEXP,BOCE,COMC,CPYR,GDDS,GDSV,GSCB,LICF,MP2B,POPE,ROYA,SCVE,SERV,SUBS,SUPP,TRAD,CHAR,COMT,MP2P,ECPG,ECPR,ECPU,EPAY,CLPR,COMP,DBTC,GOVI,HLRP,HLST,INPC,INPR,INSC,INSU,INTE,LBRI,LIFI,LOAN,LOAR,PENO,PPTI,RELG,RINP,TRFD,FORW,FXNT,ADMG,ADVA,BCDM,BCFG,BLDM,BNET,CBFF,CBFR,CCRD,CDBL,CFEE,CGDD,CORT,COST,CPKC,DCRD,DSMT,DVPM,EDUC,FACT,FAND,FCPM,FEES,GOVT,ICCP,IDCP,IHRP,INSM,IVPT,MCDM,MCFG,MSVC,NOWS,OCDM,OCFG,OFEE,OTHR,PADD,PTSP,RCKE,RCPT,REBT,REFU,RENT,REOD,RIMB,RPNT,RRBN,RVPM,SLPI,SPLT,STDY,TBAN,TBIL,TCSC,TELI,TMPG,TPRI,TPRP,TRNC,TRVC,WEBI,ANNI,CAFI,CFDI,CMDT,DERI,DIVD,FREX,HEDG,INVS,PRME,SAVG,SECU,SEPI,TREA,UNIT,FNET,FUTR,ANTS,CVCF,DMEQ,DNTS,HLTC,HLTI,HSPC,ICRF,LTCF,MAFC,MARF,MDCS,VIEW,CDEP,SWFP,SWPP,SWRS,SWUF,ADCS,AEMP,ALLW,ALMY,BBSC,BECH,BENE,BONU,CCHD,COMM,CSLP,GFRP,GVEA,GVEB,GVEC,GVED,GWLT,HREC,PAYR,PEFC,PENS,PRCP,RHBS,SALA,SSBE,LBIN,LCOL,LFEE,LMEQ,LMFI,LMRK,LREB,LREV,LSFL,ESTX,FWLV,GSTX,HSTX,INTX,NITX,PTXP,RDTX,TAXS,VATX,WHLD,TAXR,B112,BR12,TLRF,TLRR,AIRB,BUSB,FERB,RLWY,TRPT,CBTV,ELEC,ENRG,GASB,NWCH,NWCM,OTLC,PHON,UBIL,WTER
 */

@JsonClass(generateAdapter = false)
enum class PurposeCode(val value: kotlin.String) {

    @Json(name = "BKDF")
    BKDF("BKDF"),

    @Json(name = "BKFE")
    BKFE("BKFE"),

    @Json(name = "BKFM")
    BKFM("BKFM"),

    @Json(name = "BKIP")
    BKIP("BKIP"),

    @Json(name = "BKPP")
    BKPP("BKPP"),

    @Json(name = "CBLK")
    CBLK("CBLK"),

    @Json(name = "CDCB")
    CDCB("CDCB"),

    @Json(name = "CDCD")
    CDCD("CDCD"),

    @Json(name = "CDCS")
    CDCS("CDCS"),

    @Json(name = "CDDP")
    CDDP("CDDP"),

    @Json(name = "CDOC")
    CDOC("CDOC"),

    @Json(name = "CDQC")
    CDQC("CDQC"),

    @Json(name = "ETUP")
    ETUP("ETUP"),

    @Json(name = "FCOL")
    FCOL("FCOL"),

    @Json(name = "MTUP")
    MTUP("MTUP"),

    @Json(name = "ACCT")
    ACCT("ACCT"),

    @Json(name = "CASH")
    CASH("CASH"),

    @Json(name = "COLL")
    COLL("COLL"),

    @Json(name = "CSDB")
    CSDB("CSDB"),

    @Json(name = "DEPT")
    DEPT("DEPT"),

    @Json(name = "INTC")
    INTC("INTC"),

    @Json(name = "LIMA")
    LIMA("LIMA"),

    @Json(name = "NETT")
    NETT("NETT"),

    @Json(name = "BFWD")
    BFWD("BFWD"),

    @Json(name = "CCIR")
    CCIR("CCIR"),

    @Json(name = "CCPC")
    CCPC("CCPC"),

    @Json(name = "CCPM")
    CCPM("CCPM"),

    @Json(name = "CCSM")
    CCSM("CCSM"),

    @Json(name = "CRDS")
    CRDS("CRDS"),

    @Json(name = "CRPR")
    CRPR("CRPR"),

    @Json(name = "CRSP")
    CRSP("CRSP"),

    @Json(name = "CRTL")
    CRTL("CRTL"),

    @Json(name = "EQPT")
    EQPT("EQPT"),

    @Json(name = "EQUS")
    EQUS("EQUS"),

    @Json(name = "EXPT")
    EXPT("EXPT"),

    @Json(name = "EXTD")
    EXTD("EXTD"),

    @Json(name = "FIXI")
    FIXI("FIXI"),

    @Json(name = "FWBC")
    FWBC("FWBC"),

    @Json(name = "FWCC")
    FWCC("FWCC"),

    @Json(name = "FWSB")
    FWSB("FWSB"),

    @Json(name = "FWSC")
    FWSC("FWSC"),

    @Json(name = "MARG")
    MARG("MARG"),

    @Json(name = "MBSB")
    MBSB("MBSB"),

    @Json(name = "MBSC")
    MBSC("MBSC"),

    @Json(name = "MGCC")
    MGCC("MGCC"),

    @Json(name = "MGSC")
    MGSC("MGSC"),

    @Json(name = "OCCC")
    OCCC("OCCC"),

    @Json(name = "OPBC")
    OPBC("OPBC"),

    @Json(name = "OPCC")
    OPCC("OPCC"),

    @Json(name = "OPSB")
    OPSB("OPSB"),

    @Json(name = "OPSC")
    OPSC("OPSC"),

    @Json(name = "OPTN")
    OPTN("OPTN"),

    @Json(name = "OTCD")
    OTCD("OTCD"),

    @Json(name = "REPO")
    REPO("REPO"),

    @Json(name = "RPBC")
    RPBC("RPBC"),

    @Json(name = "RPCC")
    RPCC("RPCC"),

    @Json(name = "RPSB")
    RPSB("RPSB"),

    @Json(name = "RPSC")
    RPSC("RPSC"),

    @Json(name = "RVPO")
    RVPO("RVPO"),

    @Json(name = "SBSC")
    SBSC("SBSC"),

    @Json(name = "SCIE")
    SCIE("SCIE"),

    @Json(name = "SCIR")
    SCIR("SCIR"),

    @Json(name = "SCRP")
    SCRP("SCRP"),

    @Json(name = "SHBC")
    SHBC("SHBC"),

    @Json(name = "SHCC")
    SHCC("SHCC"),

    @Json(name = "SHSL")
    SHSL("SHSL"),

    @Json(name = "SLEB")
    SLEB("SLEB"),

    @Json(name = "SLOA")
    SLOA("SLOA"),

    @Json(name = "SWBC")
    SWBC("SWBC"),

    @Json(name = "SWCC")
    SWCC("SWCC"),

    @Json(name = "SWPT")
    SWPT("SWPT"),

    @Json(name = "SWSB")
    SWSB("SWSB"),

    @Json(name = "SWSC")
    SWSC("SWSC"),

    @Json(name = "TBAS")
    TBAS("TBAS"),

    @Json(name = "TBBC")
    TBBC("TBBC"),

    @Json(name = "TBCC")
    TBCC("TBCC"),

    @Json(name = "TRCP")
    TRCP("TRCP"),

    @Json(name = "AGRT")
    AGRT("AGRT"),

    @Json(name = "AREN")
    AREN("AREN"),

    @Json(name = "BEXP")
    BEXP("BEXP"),

    @Json(name = "BOCE")
    BOCE("BOCE"),

    @Json(name = "COMC")
    COMC("COMC"),

    @Json(name = "CPYR")
    CPYR("CPYR"),

    @Json(name = "GDDS")
    GDDS("GDDS"),

    @Json(name = "GDSV")
    GDSV("GDSV"),

    @Json(name = "GSCB")
    GSCB("GSCB"),

    @Json(name = "LICF")
    LICF("LICF"),

    @Json(name = "MP2B")
    MP2B("MP2B"),

    @Json(name = "POPE")
    POPE("POPE"),

    @Json(name = "ROYA")
    ROYA("ROYA"),

    @Json(name = "SCVE")
    SCVE("SCVE"),

    @Json(name = "SERV")
    SERV("SERV"),

    @Json(name = "SUBS")
    SUBS("SUBS"),

    @Json(name = "SUPP")
    SUPP("SUPP"),

    @Json(name = "TRAD")
    TRAD("TRAD"),

    @Json(name = "CHAR")
    CHAR("CHAR"),

    @Json(name = "COMT")
    COMT("COMT"),

    @Json(name = "MP2P")
    MP2P("MP2P"),

    @Json(name = "ECPG")
    ECPG("ECPG"),

    @Json(name = "ECPR")
    ECPR("ECPR"),

    @Json(name = "ECPU")
    ECPU("ECPU"),

    @Json(name = "EPAY")
    EPAY("EPAY"),

    @Json(name = "CLPR")
    CLPR("CLPR"),

    @Json(name = "COMP")
    COMP("COMP"),

    @Json(name = "DBTC")
    DBTC("DBTC"),

    @Json(name = "GOVI")
    GOVI("GOVI"),

    @Json(name = "HLRP")
    HLRP("HLRP"),

    @Json(name = "HLST")
    HLST("HLST"),

    @Json(name = "INPC")
    INPC("INPC"),

    @Json(name = "INPR")
    INPR("INPR"),

    @Json(name = "INSC")
    INSC("INSC"),

    @Json(name = "INSU")
    INSU("INSU"),

    @Json(name = "INTE")
    INTE("INTE"),

    @Json(name = "LBRI")
    LBRI("LBRI"),

    @Json(name = "LIFI")
    LIFI("LIFI"),

    @Json(name = "LOAN")
    LOAN("LOAN"),

    @Json(name = "LOAR")
    LOAR("LOAR"),

    @Json(name = "PENO")
    PENO("PENO"),

    @Json(name = "PPTI")
    PPTI("PPTI"),

    @Json(name = "RELG")
    RELG("RELG"),

    @Json(name = "RINP")
    RINP("RINP"),

    @Json(name = "TRFD")
    TRFD("TRFD"),

    @Json(name = "FORW")
    FORW("FORW"),

    @Json(name = "FXNT")
    FXNT("FXNT"),

    @Json(name = "ADMG")
    ADMG("ADMG"),

    @Json(name = "ADVA")
    ADVA("ADVA"),

    @Json(name = "BCDM")
    BCDM("BCDM"),

    @Json(name = "BCFG")
    BCFG("BCFG"),

    @Json(name = "BLDM")
    BLDM("BLDM"),

    @Json(name = "BNET")
    BNET("BNET"),

    @Json(name = "CBFF")
    CBFF("CBFF"),

    @Json(name = "CBFR")
    CBFR("CBFR"),

    @Json(name = "CCRD")
    CCRD("CCRD"),

    @Json(name = "CDBL")
    CDBL("CDBL"),

    @Json(name = "CFEE")
    CFEE("CFEE"),

    @Json(name = "CGDD")
    CGDD("CGDD"),

    @Json(name = "CORT")
    CORT("CORT"),

    @Json(name = "COST")
    COST("COST"),

    @Json(name = "CPKC")
    CPKC("CPKC"),

    @Json(name = "DCRD")
    DCRD("DCRD"),

    @Json(name = "DSMT")
    DSMT("DSMT"),

    @Json(name = "DVPM")
    DVPM("DVPM"),

    @Json(name = "EDUC")
    EDUC("EDUC"),

    @Json(name = "FACT")
    FACT("FACT"),

    @Json(name = "FAND")
    FAND("FAND"),

    @Json(name = "FCPM")
    FCPM("FCPM"),

    @Json(name = "FEES")
    FEES("FEES"),

    @Json(name = "GOVT")
    GOVT("GOVT"),

    @Json(name = "ICCP")
    ICCP("ICCP"),

    @Json(name = "IDCP")
    IDCP("IDCP"),

    @Json(name = "IHRP")
    IHRP("IHRP"),

    @Json(name = "INSM")
    INSM("INSM"),

    @Json(name = "IVPT")
    IVPT("IVPT"),

    @Json(name = "MCDM")
    MCDM("MCDM"),

    @Json(name = "MCFG")
    MCFG("MCFG"),

    @Json(name = "MSVC")
    MSVC("MSVC"),

    @Json(name = "NOWS")
    NOWS("NOWS"),

    @Json(name = "OCDM")
    OCDM("OCDM"),

    @Json(name = "OCFG")
    OCFG("OCFG"),

    @Json(name = "OFEE")
    OFEE("OFEE"),

    @Json(name = "OTHR")
    OTHR("OTHR"),

    @Json(name = "PADD")
    PADD("PADD"),

    @Json(name = "PTSP")
    PTSP("PTSP"),

    @Json(name = "RCKE")
    RCKE("RCKE"),

    @Json(name = "RCPT")
    RCPT("RCPT"),

    @Json(name = "REBT")
    REBT("REBT"),

    @Json(name = "REFU")
    REFU("REFU"),

    @Json(name = "RENT")
    RENT("RENT"),

    @Json(name = "REOD")
    REOD("REOD"),

    @Json(name = "RIMB")
    RIMB("RIMB"),

    @Json(name = "RPNT")
    RPNT("RPNT"),

    @Json(name = "RRBN")
    RRBN("RRBN"),

    @Json(name = "RVPM")
    RVPM("RVPM"),

    @Json(name = "SLPI")
    SLPI("SLPI"),

    @Json(name = "SPLT")
    SPLT("SPLT"),

    @Json(name = "STDY")
    STDY("STDY"),

    @Json(name = "TBAN")
    TBAN("TBAN"),

    @Json(name = "TBIL")
    TBIL("TBIL"),

    @Json(name = "TCSC")
    TCSC("TCSC"),

    @Json(name = "TELI")
    TELI("TELI"),

    @Json(name = "TMPG")
    TMPG("TMPG"),

    @Json(name = "TPRI")
    TPRI("TPRI"),

    @Json(name = "TPRP")
    TPRP("TPRP"),

    @Json(name = "TRNC")
    TRNC("TRNC"),

    @Json(name = "TRVC")
    TRVC("TRVC"),

    @Json(name = "WEBI")
    WEBI("WEBI"),

    @Json(name = "ANNI")
    ANNI("ANNI"),

    @Json(name = "CAFI")
    CAFI("CAFI"),

    @Json(name = "CFDI")
    CFDI("CFDI"),

    @Json(name = "CMDT")
    CMDT("CMDT"),

    @Json(name = "DERI")
    DERI("DERI"),

    @Json(name = "DIVD")
    DIVD("DIVD"),

    @Json(name = "FREX")
    FREX("FREX"),

    @Json(name = "HEDG")
    HEDG("HEDG"),

    @Json(name = "INVS")
    INVS("INVS"),

    @Json(name = "PRME")
    PRME("PRME"),

    @Json(name = "SAVG")
    SAVG("SAVG"),

    @Json(name = "SECU")
    SECU("SECU"),

    @Json(name = "SEPI")
    SEPI("SEPI"),

    @Json(name = "TREA")
    TREA("TREA"),

    @Json(name = "UNIT")
    UNIT("UNIT"),

    @Json(name = "FNET")
    FNET("FNET"),

    @Json(name = "FUTR")
    FUTR("FUTR"),

    @Json(name = "ANTS")
    ANTS("ANTS"),

    @Json(name = "CVCF")
    CVCF("CVCF"),

    @Json(name = "DMEQ")
    DMEQ("DMEQ"),

    @Json(name = "DNTS")
    DNTS("DNTS"),

    @Json(name = "HLTC")
    HLTC("HLTC"),

    @Json(name = "HLTI")
    HLTI("HLTI"),

    @Json(name = "HSPC")
    HSPC("HSPC"),

    @Json(name = "ICRF")
    ICRF("ICRF"),

    @Json(name = "LTCF")
    LTCF("LTCF"),

    @Json(name = "MAFC")
    MAFC("MAFC"),

    @Json(name = "MARF")
    MARF("MARF"),

    @Json(name = "MDCS")
    MDCS("MDCS"),

    @Json(name = "VIEW")
    VIEW("VIEW"),

    @Json(name = "CDEP")
    CDEP("CDEP"),

    @Json(name = "SWFP")
    SWFP("SWFP"),

    @Json(name = "SWPP")
    SWPP("SWPP"),

    @Json(name = "SWRS")
    SWRS("SWRS"),

    @Json(name = "SWUF")
    SWUF("SWUF"),

    @Json(name = "ADCS")
    ADCS("ADCS"),

    @Json(name = "AEMP")
    AEMP("AEMP"),

    @Json(name = "ALLW")
    ALLW("ALLW"),

    @Json(name = "ALMY")
    ALMY("ALMY"),

    @Json(name = "BBSC")
    BBSC("BBSC"),

    @Json(name = "BECH")
    BECH("BECH"),

    @Json(name = "BENE")
    BENE("BENE"),

    @Json(name = "BONU")
    BONU("BONU"),

    @Json(name = "CCHD")
    CCHD("CCHD"),

    @Json(name = "COMM")
    COMM("COMM"),

    @Json(name = "CSLP")
    CSLP("CSLP"),

    @Json(name = "GFRP")
    GFRP("GFRP"),

    @Json(name = "GVEA")
    GVEA("GVEA"),

    @Json(name = "GVEB")
    GVEB("GVEB"),

    @Json(name = "GVEC")
    GVEC("GVEC"),

    @Json(name = "GVED")
    GVED("GVED"),

    @Json(name = "GWLT")
    GWLT("GWLT"),

    @Json(name = "HREC")
    HREC("HREC"),

    @Json(name = "PAYR")
    PAYR("PAYR"),

    @Json(name = "PEFC")
    PEFC("PEFC"),

    @Json(name = "PENS")
    PENS("PENS"),

    @Json(name = "PRCP")
    PRCP("PRCP"),

    @Json(name = "RHBS")
    RHBS("RHBS"),

    @Json(name = "SALA")
    SALA("SALA"),

    @Json(name = "SSBE")
    SSBE("SSBE"),

    @Json(name = "LBIN")
    LBIN("LBIN"),

    @Json(name = "LCOL")
    LCOL("LCOL"),

    @Json(name = "LFEE")
    LFEE("LFEE"),

    @Json(name = "LMEQ")
    LMEQ("LMEQ"),

    @Json(name = "LMFI")
    LMFI("LMFI"),

    @Json(name = "LMRK")
    LMRK("LMRK"),

    @Json(name = "LREB")
    LREB("LREB"),

    @Json(name = "LREV")
    LREV("LREV"),

    @Json(name = "LSFL")
    LSFL("LSFL"),

    @Json(name = "ESTX")
    ESTX("ESTX"),

    @Json(name = "FWLV")
    FWLV("FWLV"),

    @Json(name = "GSTX")
    GSTX("GSTX"),

    @Json(name = "HSTX")
    HSTX("HSTX"),

    @Json(name = "INTX")
    INTX("INTX"),

    @Json(name = "NITX")
    NITX("NITX"),

    @Json(name = "PTXP")
    PTXP("PTXP"),

    @Json(name = "RDTX")
    RDTX("RDTX"),

    @Json(name = "TAXS")
    TAXS("TAXS"),

    @Json(name = "VATX")
    VATX("VATX"),

    @Json(name = "WHLD")
    WHLD("WHLD"),

    @Json(name = "TAXR")
    TAXR("TAXR"),

    @Json(name = "B112")
    B112("B112"),

    @Json(name = "BR12")
    BR12("BR12"),

    @Json(name = "TLRF")
    TLRF("TLRF"),

    @Json(name = "TLRR")
    TLRR("TLRR"),

    @Json(name = "AIRB")
    AIRB("AIRB"),

    @Json(name = "BUSB")
    BUSB("BUSB"),

    @Json(name = "FERB")
    FERB("FERB"),

    @Json(name = "RLWY")
    RLWY("RLWY"),

    @Json(name = "TRPT")
    TRPT("TRPT"),

    @Json(name = "CBTV")
    CBTV("CBTV"),

    @Json(name = "ELEC")
    ELEC("ELEC"),

    @Json(name = "ENRG")
    ENRG("ENRG"),

    @Json(name = "GASB")
    GASB("GASB"),

    @Json(name = "NWCH")
    NWCH("NWCH"),

    @Json(name = "NWCM")
    NWCM("NWCM"),

    @Json(name = "OTLC")
    OTLC("OTLC"),

    @Json(name = "PHON")
    PHON("PHON"),

    @Json(name = "UBIL")
    UBIL("UBIL"),

    @Json(name = "WTER")
    WTER("WTER");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is PurposeCode) "$data" else null

        /**
         * Returns a valid [PurposeCode] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): PurposeCode? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
