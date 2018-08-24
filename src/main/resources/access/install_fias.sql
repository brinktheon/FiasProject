-- Table: public.address_object

-- DROP TABLE public.address_object;

CREATE TABLE public.address_object
(
    aoguid character varying(36) COLLATE pg_catalog."default" NOT NULL,
    formalname character varying(120) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    regioncode character varying(2) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    autocode character varying(1) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    areacode character varying(3) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    citycode character varying(3) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    ctarcode character varying(3) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    placecode character varying(3) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    streetcode character varying(4) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    extrcode character varying(4) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    sextcode character varying(3) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    offname character varying(120) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    postalcode character varying(6) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    ifnsfl character varying(4) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    terrifnsfl character varying(4) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    ifnsul character varying(4) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    terrifnsul character varying(4) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    okato character varying(11) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    oktmo character varying(11) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    updatedate date,
    shortname character varying(10) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    aolevel integer,
    parentguid character varying(36) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    aoid character varying(36) COLLATE pg_catalog."default" NOT NULL,
    previd character varying(36) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    nextid character varying(36) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    code character varying(17) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    plaincode character varying(15) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    actstatus integer,
    centstatus integer,
    operstatus integer,
    currstatus integer,
    startdate date,
    enddate date,
    normdoc character varying(36) COLLATE pg_catalog."default" DEFAULT NULL::character varying,
    livestatus integer,
    CONSTRAINT address_object_pkey PRIMARY KEY (aoid)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.address_object
    OWNER to postgres;

-- Index: ao_level_index

-- DROP INDEX public.ao_level_index;

CREATE INDEX ao_level_index
    ON public.address_object USING btree
    (aolevel)
    TABLESPACE pg_default;

-- Index: ao_parent_guid_index

-- DROP INDEX public.ao_parent_guid_index;

CREATE INDEX ao_parent_guid_index
    ON public.address_object USING btree
    (parentguid COLLATE pg_catalog."default")
    TABLESPACE pg_default;

-- Index: aoguid

-- DROP INDEX public.aoguid;

CREATE INDEX aoguid
    ON public.address_object USING btree
    (aoguid COLLATE pg_catalog."default")
    TABLESPACE pg_default;

-- Index: live_status_index

-- DROP INDEX public.live_status_index;

CREATE INDEX live_status_index
    ON public.address_object USING btree
    (livestatus)
    TABLESPACE pg_default;