// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.Process)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string expression = 55 [json_name = "expression"];</code>
   * @return The expression.
   */
  java.lang.String getExpression();
  /**
   * <code>string expression = 55 [json_name = "expression"];</code>
   * @return The bytes for expression.
   */
  com.google.protobuf.ByteString
      getExpressionBytes();

  /**
   * <code>.api.v0alpha.AppendProcess append = 30 [json_name = "append"];</code>
   * @return Whether the append field is set.
   */
  boolean hasAppend();
  /**
   * <code>.api.v0alpha.AppendProcess append = 30 [json_name = "append"];</code>
   * @return The append.
   */
  com.tcn.cloud.api.api.v0alpha.AppendProcess getAppend();
  /**
   * <code>.api.v0alpha.AppendProcess append = 30 [json_name = "append"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.AppendProcessOrBuilder getAppendOrBuilder();

  /**
   * <code>.api.v0alpha.SortCriteria sort = 31 [json_name = "sort"];</code>
   * @return Whether the sort field is set.
   */
  boolean hasSort();
  /**
   * <code>.api.v0alpha.SortCriteria sort = 31 [json_name = "sort"];</code>
   * @return The sort.
   */
  com.tcn.cloud.api.api.v0alpha.SortCriteria getSort();
  /**
   * <code>.api.v0alpha.SortCriteria sort = 31 [json_name = "sort"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SortCriteriaOrBuilder getSortOrBuilder();

  /**
   * <code>.api.v0alpha.FilterProcess filter = 32 [json_name = "filter"];</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <code>.api.v0alpha.FilterProcess filter = 32 [json_name = "filter"];</code>
   * @return The filter.
   */
  com.tcn.cloud.api.api.v0alpha.FilterProcess getFilter();
  /**
   * <code>.api.v0alpha.FilterProcess filter = 32 [json_name = "filter"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.FilterProcessOrBuilder getFilterOrBuilder();

  /**
   * <code>.api.v0alpha.GSExportProcess gs_export = 42 [json_name = "gsExport"];</code>
   * @return Whether the gsExport field is set.
   */
  boolean hasGsExport();
  /**
   * <code>.api.v0alpha.GSExportProcess gs_export = 42 [json_name = "gsExport"];</code>
   * @return The gsExport.
   */
  com.tcn.cloud.api.api.v0alpha.GSExportProcess getGsExport();
  /**
   * <code>.api.v0alpha.GSExportProcess gs_export = 42 [json_name = "gsExport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.GSExportProcessOrBuilder getGsExportOrBuilder();

  /**
   * <code>.api.v0alpha.P3ExportProcess p3_export = 44 [json_name = "p3Export"];</code>
   * @return Whether the p3Export field is set.
   */
  boolean hasP3Export();
  /**
   * <code>.api.v0alpha.P3ExportProcess p3_export = 44 [json_name = "p3Export"];</code>
   * @return The p3Export.
   */
  com.tcn.cloud.api.api.v0alpha.P3ExportProcess getP3Export();
  /**
   * <code>.api.v0alpha.P3ExportProcess p3_export = 44 [json_name = "p3Export"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.P3ExportProcessOrBuilder getP3ExportOrBuilder();

  /**
   * <pre>
   * USE LookupProcess
   * </pre>
   *
   * <code>.api.v0alpha.ComplProcess compl = 45 [json_name = "compl", deprecated = true];</code>
   * @deprecated api.v0alpha.Process.compl is deprecated.
   *     See api/v0alpha/lms.proto;l=1021
   * @return Whether the compl field is set.
   */
  @java.lang.Deprecated boolean hasCompl();
  /**
   * <pre>
   * USE LookupProcess
   * </pre>
   *
   * <code>.api.v0alpha.ComplProcess compl = 45 [json_name = "compl", deprecated = true];</code>
   * @deprecated api.v0alpha.Process.compl is deprecated.
   *     See api/v0alpha/lms.proto;l=1021
   * @return The compl.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.ComplProcess getCompl();
  /**
   * <pre>
   * USE LookupProcess
   * </pre>
   *
   * <code>.api.v0alpha.ComplProcess compl = 45 [json_name = "compl", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.ComplProcessOrBuilder getComplOrBuilder();

  /**
   * <code>.api.v0alpha.DeDupCriteria dedup = 46 [json_name = "dedup"];</code>
   * @return Whether the dedup field is set.
   */
  boolean hasDedup();
  /**
   * <code>.api.v0alpha.DeDupCriteria dedup = 46 [json_name = "dedup"];</code>
   * @return The dedup.
   */
  com.tcn.cloud.api.api.v0alpha.DeDupCriteria getDedup();
  /**
   * <code>.api.v0alpha.DeDupCriteria dedup = 46 [json_name = "dedup"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DeDupCriteriaOrBuilder getDedupOrBuilder();

  /**
   * <code>.api.v0alpha.CFSExportProcess cfs_export = 47 [json_name = "cfsExport"];</code>
   * @return Whether the cfsExport field is set.
   */
  boolean hasCfsExport();
  /**
   * <code>.api.v0alpha.CFSExportProcess cfs_export = 47 [json_name = "cfsExport"];</code>
   * @return The cfsExport.
   */
  com.tcn.cloud.api.api.v0alpha.CFSExportProcess getCfsExport();
  /**
   * <code>.api.v0alpha.CFSExportProcess cfs_export = 47 [json_name = "cfsExport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CFSExportProcessOrBuilder getCfsExportOrBuilder();

  /**
   * <code>.api.v0alpha.SftpExportProcess sftp_export = 48 [json_name = "sftpExport"];</code>
   * @return Whether the sftpExport field is set.
   */
  boolean hasSftpExport();
  /**
   * <code>.api.v0alpha.SftpExportProcess sftp_export = 48 [json_name = "sftpExport"];</code>
   * @return The sftpExport.
   */
  com.tcn.cloud.api.api.v0alpha.SftpExportProcess getSftpExport();
  /**
   * <code>.api.v0alpha.SftpExportProcess sftp_export = 48 [json_name = "sftpExport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SftpExportProcessOrBuilder getSftpExportOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeProcess reshape = 49 [json_name = "reshape"];</code>
   * @return Whether the reshape field is set.
   */
  boolean hasReshape();
  /**
   * <code>.api.v0alpha.ReshapeProcess reshape = 49 [json_name = "reshape"];</code>
   * @return The reshape.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeProcess getReshape();
  /**
   * <code>.api.v0alpha.ReshapeProcess reshape = 49 [json_name = "reshape"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeProcessOrBuilder getReshapeOrBuilder();

  /**
   * <code>.api.v0alpha.LookupProcess lookup = 50 [json_name = "lookup"];</code>
   * @return Whether the lookup field is set.
   */
  boolean hasLookup();
  /**
   * <code>.api.v0alpha.LookupProcess lookup = 50 [json_name = "lookup"];</code>
   * @return The lookup.
   */
  com.tcn.cloud.api.api.v0alpha.LookupProcess getLookup();
  /**
   * <code>.api.v0alpha.LookupProcess lookup = 50 [json_name = "lookup"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.LookupProcessOrBuilder getLookupOrBuilder();

  /**
   * <pre>
   * split into ApiEntrypoint and SftpImport
   * </pre>
   *
   * <code>.api.v0alpha.EntrypointProcess entrypoint = 51 [json_name = "entrypoint", deprecated = true];</code>
   * @deprecated api.v0alpha.Process.entrypoint is deprecated.
   *     See api/v0alpha/lms.proto;l=1028
   * @return Whether the entrypoint field is set.
   */
  @java.lang.Deprecated boolean hasEntrypoint();
  /**
   * <pre>
   * split into ApiEntrypoint and SftpImport
   * </pre>
   *
   * <code>.api.v0alpha.EntrypointProcess entrypoint = 51 [json_name = "entrypoint", deprecated = true];</code>
   * @deprecated api.v0alpha.Process.entrypoint is deprecated.
   *     See api/v0alpha/lms.proto;l=1028
   * @return The entrypoint.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.EntrypointProcess getEntrypoint();
  /**
   * <pre>
   * split into ApiEntrypoint and SftpImport
   * </pre>
   *
   * <code>.api.v0alpha.EntrypointProcess entrypoint = 51 [json_name = "entrypoint", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.EntrypointProcessOrBuilder getEntrypointOrBuilder();

  /**
   * <code>.api.v0alpha.ComplianceExportProcess compliance_export = 52 [json_name = "complianceExport"];</code>
   * @return Whether the complianceExport field is set.
   */
  boolean hasComplianceExport();
  /**
   * <code>.api.v0alpha.ComplianceExportProcess compliance_export = 52 [json_name = "complianceExport"];</code>
   * @return The complianceExport.
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceExportProcess getComplianceExport();
  /**
   * <code>.api.v0alpha.ComplianceExportProcess compliance_export = 52 [json_name = "complianceExport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceExportProcessOrBuilder getComplianceExportOrBuilder();

  /**
   * <code>.api.v0alpha.ApiEntrypoint api_entrypoint = 53 [json_name = "apiEntrypoint"];</code>
   * @return Whether the apiEntrypoint field is set.
   */
  boolean hasApiEntrypoint();
  /**
   * <code>.api.v0alpha.ApiEntrypoint api_entrypoint = 53 [json_name = "apiEntrypoint"];</code>
   * @return The apiEntrypoint.
   */
  com.tcn.cloud.api.api.v0alpha.ApiEntrypoint getApiEntrypoint();
  /**
   * <code>.api.v0alpha.ApiEntrypoint api_entrypoint = 53 [json_name = "apiEntrypoint"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ApiEntrypointOrBuilder getApiEntrypointOrBuilder();

  /**
   * <code>.api.v0alpha.SftpImport sftp_import = 54 [json_name = "sftpImport"];</code>
   * @return Whether the sftpImport field is set.
   */
  boolean hasSftpImport();
  /**
   * <code>.api.v0alpha.SftpImport sftp_import = 54 [json_name = "sftpImport"];</code>
   * @return The sftpImport.
   */
  com.tcn.cloud.api.api.v0alpha.SftpImport getSftpImport();
  /**
   * <code>.api.v0alpha.SftpImport sftp_import = 54 [json_name = "sftpImport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SftpImportOrBuilder getSftpImportOrBuilder();

  /**
   * <code>.api.v0alpha.ScrubProcess scrub = 56 [json_name = "scrub"];</code>
   * @return Whether the scrub field is set.
   */
  boolean hasScrub();
  /**
   * <code>.api.v0alpha.ScrubProcess scrub = 56 [json_name = "scrub"];</code>
   * @return The scrub.
   */
  com.tcn.cloud.api.api.v0alpha.ScrubProcess getScrub();
  /**
   * <code>.api.v0alpha.ScrubProcess scrub = 56 [json_name = "scrub"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ScrubProcessOrBuilder getScrubOrBuilder();

  /**
   * <code>.api.v0alpha.FrequencyProcess frequency = 57 [json_name = "frequency"];</code>
   * @return Whether the frequency field is set.
   */
  boolean hasFrequency();
  /**
   * <code>.api.v0alpha.FrequencyProcess frequency = 57 [json_name = "frequency"];</code>
   * @return The frequency.
   */
  com.tcn.cloud.api.api.v0alpha.FrequencyProcess getFrequency();
  /**
   * <code>.api.v0alpha.FrequencyProcess frequency = 57 [json_name = "frequency"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.FrequencyProcessOrBuilder getFrequencyOrBuilder();

  /**
   * <pre>
   * Will import a list from Durable Data Service(CJS)
   * The templates for CJS and LMS will need to match
   * </pre>
   *
   * <code>.api.v0alpha.CjsImportProcess cjs_import = 58 [json_name = "cjsImport"];</code>
   * @return Whether the cjsImport field is set.
   */
  boolean hasCjsImport();
  /**
   * <pre>
   * Will import a list from Durable Data Service(CJS)
   * The templates for CJS and LMS will need to match
   * </pre>
   *
   * <code>.api.v0alpha.CjsImportProcess cjs_import = 58 [json_name = "cjsImport"];</code>
   * @return The cjsImport.
   */
  com.tcn.cloud.api.api.v0alpha.CjsImportProcess getCjsImport();
  /**
   * <pre>
   * Will import a list from Durable Data Service(CJS)
   * The templates for CJS and LMS will need to match
   * </pre>
   *
   * <code>.api.v0alpha.CjsImportProcess cjs_import = 58 [json_name = "cjsImport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CjsImportProcessOrBuilder getCjsImportOrBuilder();

  /**
   * <pre>
   * Exports a list to Durable Data Service (CJS)
   * The exported fields will need to match the
   * CJS template if exporting to an existing list.
   * </pre>
   *
   * <code>.api.v0alpha.CjsExportProcess cjs_export = 59 [json_name = "cjsExport"];</code>
   * @return Whether the cjsExport field is set.
   */
  boolean hasCjsExport();
  /**
   * <pre>
   * Exports a list to Durable Data Service (CJS)
   * The exported fields will need to match the
   * CJS template if exporting to an existing list.
   * </pre>
   *
   * <code>.api.v0alpha.CjsExportProcess cjs_export = 59 [json_name = "cjsExport"];</code>
   * @return The cjsExport.
   */
  com.tcn.cloud.api.api.v0alpha.CjsExportProcess getCjsExport();
  /**
   * <pre>
   * Exports a list to Durable Data Service (CJS)
   * The exported fields will need to match the
   * CJS template if exporting to an existing list.
   * </pre>
   *
   * <code>.api.v0alpha.CjsExportProcess cjs_export = 59 [json_name = "cjsExport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CjsExportProcessOrBuilder getCjsExportOrBuilder();

  /**
   * <pre>
   * Enriches an LMS list with
   * data from a CJS list
   * </pre>
   *
   * <code>.api.v0alpha.CjsEnrichmentProcess cjs_enrich = 60 [json_name = "cjsEnrich"];</code>
   * @return Whether the cjsEnrich field is set.
   */
  boolean hasCjsEnrich();
  /**
   * <pre>
   * Enriches an LMS list with
   * data from a CJS list
   * </pre>
   *
   * <code>.api.v0alpha.CjsEnrichmentProcess cjs_enrich = 60 [json_name = "cjsEnrich"];</code>
   * @return The cjsEnrich.
   */
  com.tcn.cloud.api.api.v0alpha.CjsEnrichmentProcess getCjsEnrich();
  /**
   * <pre>
   * Enriches an LMS list with
   * data from a CJS list
   * </pre>
   *
   * <code>.api.v0alpha.CjsEnrichmentProcess cjs_enrich = 60 [json_name = "cjsEnrich"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.CjsEnrichmentProcessOrBuilder getCjsEnrichOrBuilder();

  /**
   * <code>.api.v0alpha.WebEntrypointProcess web_entrypoint = 61 [json_name = "webEntrypoint"];</code>
   * @return Whether the webEntrypoint field is set.
   */
  boolean hasWebEntrypoint();
  /**
   * <code>.api.v0alpha.WebEntrypointProcess web_entrypoint = 61 [json_name = "webEntrypoint"];</code>
   * @return The webEntrypoint.
   */
  com.tcn.cloud.api.api.v0alpha.WebEntrypointProcess getWebEntrypoint();
  /**
   * <code>.api.v0alpha.WebEntrypointProcess web_entrypoint = 61 [json_name = "webEntrypoint"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WebEntrypointProcessOrBuilder getWebEntrypointOrBuilder();

  /**
   * <code>.api.v0alpha.DeleteScrubEntriesProcess delete_scrub_entries = 62 [json_name = "deleteScrubEntries"];</code>
   * @return Whether the deleteScrubEntries field is set.
   */
  boolean hasDeleteScrubEntries();
  /**
   * <code>.api.v0alpha.DeleteScrubEntriesProcess delete_scrub_entries = 62 [json_name = "deleteScrubEntries"];</code>
   * @return The deleteScrubEntries.
   */
  com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcess getDeleteScrubEntries();
  /**
   * <code>.api.v0alpha.DeleteScrubEntriesProcess delete_scrub_entries = 62 [json_name = "deleteScrubEntries"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DeleteScrubEntriesProcessOrBuilder getDeleteScrubEntriesOrBuilder();

  /**
   * <code>.api.v0alpha.WfmExportProcess wfm_export = 63 [json_name = "wfmExport"];</code>
   * @return Whether the wfmExport field is set.
   */
  boolean hasWfmExport();
  /**
   * <code>.api.v0alpha.WfmExportProcess wfm_export = 63 [json_name = "wfmExport"];</code>
   * @return The wfmExport.
   */
  com.tcn.cloud.api.api.v0alpha.WfmExportProcess getWfmExport();
  /**
   * <code>.api.v0alpha.WfmExportProcess wfm_export = 63 [json_name = "wfmExport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WfmExportProcessOrBuilder getWfmExportOrBuilder();

  /**
   * <code>.api.v0alpha.PaymentLinkEnrichment link_enrich = 64 [json_name = "linkEnrich", deprecated = true];</code>
   * @deprecated api.v0alpha.Process.link_enrich is deprecated.
   *     See api/v0alpha/lms.proto;l=1047
   * @return Whether the linkEnrich field is set.
   */
  @java.lang.Deprecated boolean hasLinkEnrich();
  /**
   * <code>.api.v0alpha.PaymentLinkEnrichment link_enrich = 64 [json_name = "linkEnrich", deprecated = true];</code>
   * @deprecated api.v0alpha.Process.link_enrich is deprecated.
   *     See api/v0alpha/lms.proto;l=1047
   * @return The linkEnrich.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.PaymentLinkEnrichment getLinkEnrich();
  /**
   * <code>.api.v0alpha.PaymentLinkEnrichment link_enrich = 64 [json_name = "linkEnrich", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.v0alpha.PaymentLinkEnrichmentOrBuilder getLinkEnrichOrBuilder();

  /**
   * <code>.api.v0alpha.RndEnrichmentProcess rnd = 65 [json_name = "rnd"];</code>
   * @return Whether the rnd field is set.
   */
  boolean hasRnd();
  /**
   * <code>.api.v0alpha.RndEnrichmentProcess rnd = 65 [json_name = "rnd"];</code>
   * @return The rnd.
   */
  com.tcn.cloud.api.api.v0alpha.RndEnrichmentProcess getRnd();
  /**
   * <code>.api.v0alpha.RndEnrichmentProcess rnd = 65 [json_name = "rnd"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.RndEnrichmentProcessOrBuilder getRndOrBuilder();

  /**
   * <pre>
   * Enriches an LMS list with consent data
   * </pre>
   *
   * <code>.api.v0alpha.ConsentEnrichmentProcess consent_enrich = 66 [json_name = "consentEnrich"];</code>
   * @return Whether the consentEnrich field is set.
   */
  boolean hasConsentEnrich();
  /**
   * <pre>
   * Enriches an LMS list with consent data
   * </pre>
   *
   * <code>.api.v0alpha.ConsentEnrichmentProcess consent_enrich = 66 [json_name = "consentEnrich"];</code>
   * @return The consentEnrich.
   */
  com.tcn.cloud.api.api.v0alpha.ConsentEnrichmentProcess getConsentEnrich();
  /**
   * <pre>
   * Enriches an LMS list with consent data
   * </pre>
   *
   * <code>.api.v0alpha.ConsentEnrichmentProcess consent_enrich = 66 [json_name = "consentEnrich"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ConsentEnrichmentProcessOrBuilder getConsentEnrichOrBuilder();

  /**
   * <pre>
   * Exchanges with compliance consent to add or delete consents
   * </pre>
   *
   * <code>.api.v0alpha.ConsentExportProcess consent_export = 67 [json_name = "consentExport"];</code>
   * @return Whether the consentExport field is set.
   */
  boolean hasConsentExport();
  /**
   * <pre>
   * Exchanges with compliance consent to add or delete consents
   * </pre>
   *
   * <code>.api.v0alpha.ConsentExportProcess consent_export = 67 [json_name = "consentExport"];</code>
   * @return The consentExport.
   */
  com.tcn.cloud.api.api.v0alpha.ConsentExportProcess getConsentExport();
  /**
   * <pre>
   * Exchanges with compliance consent to add or delete consents
   * </pre>
   *
   * <code>.api.v0alpha.ConsentExportProcess consent_export = 67 [json_name = "consentExport"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ConsentExportProcessOrBuilder getConsentExportOrBuilder();

  /**
   * <pre>
   * Processes a list through compliance and enriching
   * whether a coule would have been permitted or not
   * </pre>
   *
   * <code>.api.v0alpha.ComplianceProcessor compliance_processor = 69 [json_name = "complianceProcessor"];</code>
   * @return Whether the complianceProcessor field is set.
   */
  boolean hasComplianceProcessor();
  /**
   * <pre>
   * Processes a list through compliance and enriching
   * whether a coule would have been permitted or not
   * </pre>
   *
   * <code>.api.v0alpha.ComplianceProcessor compliance_processor = 69 [json_name = "complianceProcessor"];</code>
   * @return The complianceProcessor.
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceProcessor getComplianceProcessor();
  /**
   * <pre>
   * Processes a list through compliance and enriching
   * whether a coule would have been permitted or not
   * </pre>
   *
   * <code>.api.v0alpha.ComplianceProcessor compliance_processor = 69 [json_name = "complianceProcessor"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ComplianceProcessorOrBuilder getComplianceProcessorOrBuilder();

  /**
   * <code>.api.v0alpha.ConsentEntrypointProcess consent_entrypoint = 70 [json_name = "consentEntrypoint"];</code>
   * @return Whether the consentEntrypoint field is set.
   */
  boolean hasConsentEntrypoint();
  /**
   * <code>.api.v0alpha.ConsentEntrypointProcess consent_entrypoint = 70 [json_name = "consentEntrypoint"];</code>
   * @return The consentEntrypoint.
   */
  com.tcn.cloud.api.api.v0alpha.ConsentEntrypointProcess getConsentEntrypoint();
  /**
   * <code>.api.v0alpha.ConsentEntrypointProcess consent_entrypoint = 70 [json_name = "consentEntrypoint"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ConsentEntrypointProcessOrBuilder getConsentEntrypointOrBuilder();

  /**
   * <code>.api.v0alpha.PortalLinkEnrichment portal_link_enrich = 71 [json_name = "portalLinkEnrich"];</code>
   * @return Whether the portalLinkEnrich field is set.
   */
  boolean hasPortalLinkEnrich();
  /**
   * <code>.api.v0alpha.PortalLinkEnrichment portal_link_enrich = 71 [json_name = "portalLinkEnrich"];</code>
   * @return The portalLinkEnrich.
   */
  com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment getPortalLinkEnrich();
  /**
   * <code>.api.v0alpha.PortalLinkEnrichment portal_link_enrich = 71 [json_name = "portalLinkEnrich"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichmentOrBuilder getPortalLinkEnrichOrBuilder();

  /**
   * <code>.api.v0alpha.BulkWebEntrypointProcess bulk_web_entrypoint = 72 [json_name = "bulkWebEntrypoint"];</code>
   * @return Whether the bulkWebEntrypoint field is set.
   */
  boolean hasBulkWebEntrypoint();
  /**
   * <code>.api.v0alpha.BulkWebEntrypointProcess bulk_web_entrypoint = 72 [json_name = "bulkWebEntrypoint"];</code>
   * @return The bulkWebEntrypoint.
   */
  com.tcn.cloud.api.api.v0alpha.BulkWebEntrypointProcess getBulkWebEntrypoint();
  /**
   * <code>.api.v0alpha.BulkWebEntrypointProcess bulk_web_entrypoint = 72 [json_name = "bulkWebEntrypoint"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.BulkWebEntrypointProcessOrBuilder getBulkWebEntrypointOrBuilder();

  /**
   * <pre>
   * OmniExchangeProcess allows omni to import contacts using LMS file upload
   * </pre>
   *
   * <code>.api.v0alpha.OmniExchangeProcess omni_exchange_process = 73 [json_name = "omniExchangeProcess"];</code>
   * @return Whether the omniExchangeProcess field is set.
   */
  boolean hasOmniExchangeProcess();
  /**
   * <pre>
   * OmniExchangeProcess allows omni to import contacts using LMS file upload
   * </pre>
   *
   * <code>.api.v0alpha.OmniExchangeProcess omni_exchange_process = 73 [json_name = "omniExchangeProcess"];</code>
   * @return The omniExchangeProcess.
   */
  com.tcn.cloud.api.api.v0alpha.OmniExchangeProcess getOmniExchangeProcess();
  /**
   * <pre>
   * OmniExchangeProcess allows omni to import contacts using LMS file upload
   * </pre>
   *
   * <code>.api.v0alpha.OmniExchangeProcess omni_exchange_process = 73 [json_name = "omniExchangeProcess"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.OmniExchangeProcessOrBuilder getOmniExchangeProcessOrBuilder();

  /**
   * <pre>
   * WebExchangeProcess allows a user to setup a process to send data to an external api
   * </pre>
   *
   * <code>.api.v0alpha.WebExchangeProcess web_exchange_process = 74 [json_name = "webExchangeProcess"];</code>
   * @return Whether the webExchangeProcess field is set.
   */
  boolean hasWebExchangeProcess();
  /**
   * <pre>
   * WebExchangeProcess allows a user to setup a process to send data to an external api
   * </pre>
   *
   * <code>.api.v0alpha.WebExchangeProcess web_exchange_process = 74 [json_name = "webExchangeProcess"];</code>
   * @return The webExchangeProcess.
   */
  com.tcn.cloud.api.api.v0alpha.WebExchangeProcess getWebExchangeProcess();
  /**
   * <pre>
   * WebExchangeProcess allows a user to setup a process to send data to an external api
   * </pre>
   *
   * <code>.api.v0alpha.WebExchangeProcess web_exchange_process = 74 [json_name = "webExchangeProcess"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.WebExchangeProcessOrBuilder getWebExchangeProcessOrBuilder();

  /**
   * <code>.api.v0alpha.SplitCriteria split = 75 [json_name = "split"];</code>
   * @return Whether the split field is set.
   */
  boolean hasSplit();
  /**
   * <code>.api.v0alpha.SplitCriteria split = 75 [json_name = "split"];</code>
   * @return The split.
   */
  com.tcn.cloud.api.api.v0alpha.SplitCriteria getSplit();
  /**
   * <code>.api.v0alpha.SplitCriteria split = 75 [json_name = "split"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SplitCriteriaOrBuilder getSplitOrBuilder();

  /**
   * <code>.api.v0alpha.EpicEntrypoint epic_entry_point = 76 [json_name = "epicEntryPoint"];</code>
   * @return Whether the epicEntryPoint field is set.
   */
  boolean hasEpicEntryPoint();
  /**
   * <code>.api.v0alpha.EpicEntrypoint epic_entry_point = 76 [json_name = "epicEntryPoint"];</code>
   * @return The epicEntryPoint.
   */
  com.tcn.cloud.api.api.v0alpha.EpicEntrypoint getEpicEntryPoint();
  /**
   * <code>.api.v0alpha.EpicEntrypoint epic_entry_point = 76 [json_name = "epicEntryPoint"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.EpicEntrypointOrBuilder getEpicEntryPointOrBuilder();

  /**
   * <code>.api.v0alpha.ContactManagerSink contact_manager_sink = 77 [json_name = "contactManagerSink"];</code>
   * @return Whether the contactManagerSink field is set.
   */
  boolean hasContactManagerSink();
  /**
   * <code>.api.v0alpha.ContactManagerSink contact_manager_sink = 77 [json_name = "contactManagerSink"];</code>
   * @return The contactManagerSink.
   */
  com.tcn.cloud.api.api.v0alpha.ContactManagerSink getContactManagerSink();
  /**
   * <code>.api.v0alpha.ContactManagerSink contact_manager_sink = 77 [json_name = "contactManagerSink"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ContactManagerSinkOrBuilder getContactManagerSinkOrBuilder();

  /**
   * <code>.api.v0alpha.SumProcess sum = 78 [json_name = "sum"];</code>
   * @return Whether the sum field is set.
   */
  boolean hasSum();
  /**
   * <code>.api.v0alpha.SumProcess sum = 78 [json_name = "sum"];</code>
   * @return The sum.
   */
  com.tcn.cloud.api.api.v0alpha.SumProcess getSum();
  /**
   * <code>.api.v0alpha.SumProcess sum = 78 [json_name = "sum"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.SumProcessOrBuilder getSumOrBuilder();

  com.tcn.cloud.api.api.v0alpha.Process.ProcCase getProcCase();
}
