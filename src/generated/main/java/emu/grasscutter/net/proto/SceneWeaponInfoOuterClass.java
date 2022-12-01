// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SceneWeaponInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneWeaponInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneWeaponInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_SceneWeaponInfo_AffixMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneWeaponInfo_AffixMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneWeaponInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneWeaponInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015SceneWeaponInfo.proto\u001a\u001aAbilitySyncStateInfo.proto\u001a\u001fEntityRendererChangedInfo.proto\"\u00c8\u0002\n\u000fSceneWeaponInfo\u0012\u0011\n\tentity_id\u0018\u0001 \u0001(\r\u0012\u0011\n\tgadget_id\u0018\u0002 \u0001(\r\u0012\u000f\n\u0007item_id\u0018\u0003 \u0001(\r\u0012\f\n\u0004guid\u0018\u0004 \u0001(\u0004\u0012\r\n\u0005level\u0018\u0005 \u0001(\r\u0012\u0015\n\rpromote_level\u0018\u0006 \u0001(\r\u0012+\n\fability_info\u0018\u0007 \u0001(\u000b2\u0015.AbilitySyncStateInfo\u00121\n\taffix_map\u0018\b \u0003(\u000b2\u001e.SceneWeaponInfo.AffixMapEntry\u00129\n\u0015renderer_changed_info\u0018\t \u0001(\u000b2\u001a.EntityRendererChangedInfo\u001a/\n\rAffixMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\r\n\u0005value\u0018\u0002 \u0001(\r:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneWeaponInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilitySyncStateInfoOuterClass.getDescriptor(), EntityRendererChangedInfoOuterClass.getDescriptor() });
        internal_static_SceneWeaponInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneWeaponInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_descriptor, new String[] { "EntityId", "GadgetId", "ItemId", "Guid", "Level", "PromoteLevel", "AbilityInfo", "AffixMap", "RendererChangedInfo" });
        internal_static_SceneWeaponInfo_AffixMapEntry_descriptor = SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_descriptor.getNestedTypes().get(0);
        internal_static_SceneWeaponInfo_AffixMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_AffixMapEntry_descriptor, new String[] { "Key", "Value" });
        AbilitySyncStateInfoOuterClass.getDescriptor();
        EntityRendererChangedInfoOuterClass.getDescriptor();
    }
    
    public static final class SceneWeaponInfo extends GeneratedMessageV3 implements SceneWeaponInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 1;
        private int entityId_;
        public static final int GADGET_ID_FIELD_NUMBER = 2;
        private int gadgetId_;
        public static final int ITEM_ID_FIELD_NUMBER = 3;
        private int itemId_;
        public static final int GUID_FIELD_NUMBER = 4;
        private long guid_;
        public static final int LEVEL_FIELD_NUMBER = 5;
        private int level_;
        public static final int PROMOTE_LEVEL_FIELD_NUMBER = 6;
        private int promoteLevel_;
        public static final int ABILITY_INFO_FIELD_NUMBER = 7;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
        public static final int AFFIX_MAP_FIELD_NUMBER = 8;
        private MapField<Integer, Integer> affixMap_;
        public static final int RENDERER_CHANGED_INFO_FIELD_NUMBER = 9;
        private EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo rendererChangedInfo_;
        private byte memoizedIsInitialized;
        private static final SceneWeaponInfo DEFAULT_INSTANCE;
        private static final Parser<SceneWeaponInfo> PARSER;
        
        private SceneWeaponInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneWeaponInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneWeaponInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneWeaponInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.gadgetId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.itemId_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.guid_ = input.readUInt64();
                            continue;
                        }
                        case 40: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 48: {
                            this.promoteLevel_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
                            if (this.abilityInfo_ != null) {
                                subBuilder = this.abilityInfo_.toBuilder();
                            }
                            this.abilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.abilityInfo_);
                                this.abilityInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.affixMap_ = MapField.newMapField(AffixMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, Integer> affixMap__ = input.readMessage(AffixMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.affixMap_.getMutableMap().put(affixMap__.getKey(), affixMap__.getValue());
                            continue;
                        }
                        case 74: {
                            EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder subBuilder2 = null;
                            if (this.rendererChangedInfo_ != null) {
                                subBuilder2 = this.rendererChangedInfo_.toBuilder();
                            }
                            this.rendererChangedInfo_ = input.readMessage(EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.rendererChangedInfo_);
                                this.rendererChangedInfo_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 8: {
                    return this.internalGetAffixMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneWeaponInfo.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getGadgetId() {
            return this.gadgetId_;
        }
        
        @Override
        public int getItemId() {
            return this.itemId_;
        }
        
        @Override
        public long getGuid() {
            return this.guid_;
        }
        
        @Override
        public int getLevel() {
            return this.level_;
        }
        
        @Override
        public int getPromoteLevel() {
            return this.promoteLevel_;
        }
        
        @Override
        public boolean hasAbilityInfo() {
            return this.abilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
            return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
            return this.getAbilityInfo();
        }
        
        private MapField<Integer, Integer> internalGetAffixMap() {
            if (this.affixMap_ == null) {
                return MapField.emptyMapField(AffixMapDefaultEntryHolder.defaultEntry);
            }
            return this.affixMap_;
        }
        
        @Override
        public int getAffixMapCount() {
            return this.internalGetAffixMap().getMap().size();
        }
        
        @Override
        public boolean containsAffixMap(final int key) {
            return this.internalGetAffixMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, Integer> getAffixMap() {
            return this.getAffixMapMap();
        }
        
        @Override
        public Map<Integer, Integer> getAffixMapMap() {
            return this.internalGetAffixMap().getMap();
        }
        
        @Override
        public int getAffixMapOrDefault(final int key, final int defaultValue) {
            final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public int getAffixMapOrThrow(final int key) {
            final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public boolean hasRendererChangedInfo() {
            return this.rendererChangedInfo_ != null;
        }
        
        @Override
        public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo() {
            return (this.rendererChangedInfo_ == null) ? EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : this.rendererChangedInfo_;
        }
        
        @Override
        public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder() {
            return this.getRendererChangedInfo();
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.entityId_ != 0) {
                output.writeUInt32(1, this.entityId_);
            }
            if (this.gadgetId_ != 0) {
                output.writeUInt32(2, this.gadgetId_);
            }
            if (this.itemId_ != 0) {
                output.writeUInt32(3, this.itemId_);
            }
            if (this.guid_ != 0L) {
                output.writeUInt64(4, this.guid_);
            }
            if (this.level_ != 0) {
                output.writeUInt32(5, this.level_);
            }
            if (this.promoteLevel_ != 0) {
                output.writeUInt32(6, this.promoteLevel_);
            }
            if (this.abilityInfo_ != null) {
                output.writeMessage(7, this.getAbilityInfo());
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetAffixMap(), AffixMapDefaultEntryHolder.defaultEntry, 8);
            if (this.rendererChangedInfo_ != null) {
                output.writeMessage(9, this.getRendererChangedInfo());
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.entityId_);
            }
            if (this.gadgetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.gadgetId_);
            }
            if (this.itemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.itemId_);
            }
            if (this.guid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.guid_);
            }
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.level_);
            }
            if (this.promoteLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.promoteLevel_);
            }
            if (this.abilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getAbilityInfo());
            }
            for (final Map.Entry<Integer, Integer> entry : this.internalGetAffixMap().getMap().entrySet()) {
                final MapEntry<Integer, Integer> affixMap__ = AffixMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(8, affixMap__);
            }
            if (this.rendererChangedInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getRendererChangedInfo());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneWeaponInfo)) {
                return super.equals(obj);
            }
            final SceneWeaponInfo other = (SceneWeaponInfo)obj;
            return this.getEntityId() == other.getEntityId() && this.getGadgetId() == other.getGadgetId() && this.getItemId() == other.getItemId() && this.getGuid() == other.getGuid() && this.getLevel() == other.getLevel() && this.getPromoteLevel() == other.getPromoteLevel() && this.hasAbilityInfo() == other.hasAbilityInfo() && (!this.hasAbilityInfo() || this.getAbilityInfo().equals(other.getAbilityInfo())) && this.internalGetAffixMap().equals(other.internalGetAffixMap()) && this.hasRendererChangedInfo() == other.hasRendererChangedInfo() && (!this.hasRendererChangedInfo() || this.getRendererChangedInfo().equals(other.getRendererChangedInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getGadgetId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getItemId();
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getGuid());
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getLevel();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPromoteLevel();
            if (this.hasAbilityInfo()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getAbilityInfo().hashCode();
            }
            if (!this.internalGetAffixMap().getMap().isEmpty()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.internalGetAffixMap().hashCode();
            }
            if (this.hasRendererChangedInfo()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getRendererChangedInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneWeaponInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneWeaponInfo.PARSER.parseFrom(data);
        }
        
        public static SceneWeaponInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneWeaponInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneWeaponInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneWeaponInfo.PARSER.parseFrom(data);
        }
        
        public static SceneWeaponInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneWeaponInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneWeaponInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneWeaponInfo.PARSER.parseFrom(data);
        }
        
        public static SceneWeaponInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneWeaponInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneWeaponInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneWeaponInfo.PARSER, input);
        }
        
        public static SceneWeaponInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneWeaponInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneWeaponInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneWeaponInfo.PARSER, input);
        }
        
        public static SceneWeaponInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneWeaponInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneWeaponInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneWeaponInfo.PARSER, input);
        }
        
        public static SceneWeaponInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneWeaponInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneWeaponInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneWeaponInfo prototype) {
            return SceneWeaponInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneWeaponInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneWeaponInfo getDefaultInstance() {
            return SceneWeaponInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneWeaponInfo> parser() {
            return SceneWeaponInfo.PARSER;
        }
        
        @Override
        public Parser<SceneWeaponInfo> getParserForType() {
            return SceneWeaponInfo.PARSER;
        }
        
        @Override
        public SceneWeaponInfo getDefaultInstanceForType() {
            return SceneWeaponInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneWeaponInfo();
            PARSER = new AbstractParser<SceneWeaponInfo>() {
                @Override
                public SceneWeaponInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneWeaponInfo(input, extensionRegistry);
                }
            };
        }
        
        private static final class AffixMapDefaultEntryHolder
        {
            static final MapEntry<Integer, Integer> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_AffixMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.UINT32, 0);
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneWeaponInfoOrBuilder
        {
            private int bitField0_;
            private int entityId_;
            private int gadgetId_;
            private int itemId_;
            private long guid_;
            private int level_;
            private int promoteLevel_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
            private MapField<Integer, Integer> affixMap_;
            private EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo rendererChangedInfo_;
            private SingleFieldBuilderV3<EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder> rendererChangedInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetAffixMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 8: {
                        return this.internalGetMutableAffixMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneWeaponInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneWeaponInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                this.gadgetId_ = 0;
                this.itemId_ = 0;
                this.guid_ = 0L;
                this.level_ = 0;
                this.promoteLevel_ = 0;
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = null;
                }
                else {
                    this.abilityInfo_ = null;
                    this.abilityInfoBuilder_ = null;
                }
                this.internalGetMutableAffixMap().clear();
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfo_ = null;
                }
                else {
                    this.rendererChangedInfo_ = null;
                    this.rendererChangedInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneWeaponInfoOuterClass.internal_static_SceneWeaponInfo_descriptor;
            }
            
            @Override
            public SceneWeaponInfo getDefaultInstanceForType() {
                return SceneWeaponInfo.getDefaultInstance();
            }
            
            @Override
            public SceneWeaponInfo build() {
                final SceneWeaponInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneWeaponInfo buildPartial() {
                final SceneWeaponInfo result = new SceneWeaponInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.entityId_ = this.entityId_;
                result.gadgetId_ = this.gadgetId_;
                result.itemId_ = this.itemId_;
                result.guid_ = this.guid_;
                result.level_ = this.level_;
                result.promoteLevel_ = this.promoteLevel_;
                if (this.abilityInfoBuilder_ == null) {
                    result.abilityInfo_ = this.abilityInfo_;
                }
                else {
                    result.abilityInfo_ = this.abilityInfoBuilder_.build();
                }
                (result.affixMap_ = this.internalGetAffixMap()).makeImmutable();
                if (this.rendererChangedInfoBuilder_ == null) {
                    result.rendererChangedInfo_ = this.rendererChangedInfo_;
                }
                else {
                    result.rendererChangedInfo_ = this.rendererChangedInfoBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof SceneWeaponInfo) {
                    return this.mergeFrom((SceneWeaponInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneWeaponInfo other) {
                if (other == SceneWeaponInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getGadgetId() != 0) {
                    this.setGadgetId(other.getGadgetId());
                }
                if (other.getItemId() != 0) {
                    this.setItemId(other.getItemId());
                }
                if (other.getGuid() != 0L) {
                    this.setGuid(other.getGuid());
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
                }
                if (other.getPromoteLevel() != 0) {
                    this.setPromoteLevel(other.getPromoteLevel());
                }
                if (other.hasAbilityInfo()) {
                    this.mergeAbilityInfo(other.getAbilityInfo());
                }
                this.internalGetMutableAffixMap().mergeFrom(other.internalGetAffixMap());
                if (other.hasRendererChangedInfo()) {
                    this.mergeRendererChangedInfo(other.getRendererChangedInfo());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                SceneWeaponInfo parsedMessage = null;
                try {
                    parsedMessage = SceneWeaponInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneWeaponInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetId() {
                return this.gadgetId_;
            }
            
            public Builder setGadgetId(final int value) {
                this.gadgetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetId() {
                this.gadgetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getItemId() {
                return this.itemId_;
            }
            
            public Builder setItemId(final int value) {
                this.itemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearItemId() {
                this.itemId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public long getGuid() {
                return this.guid_;
            }
            
            public Builder setGuid(final long value) {
                this.guid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGuid() {
                this.guid_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getPromoteLevel() {
                return this.promoteLevel_;
            }
            
            public Builder setPromoteLevel(final int value) {
                this.promoteLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPromoteLevel() {
                this.promoteLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasAbilityInfo() {
                return this.abilityInfoBuilder_ != null || this.abilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
                if (this.abilityInfoBuilder_ == null) {
                    return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
                }
                return this.abilityInfoBuilder_.getMessage();
            }
            
            public Builder setAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.abilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.abilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.abilityInfoBuilder_ == null) {
                    if (this.abilityInfo_ != null) {
                        this.abilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.abilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.abilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAbilityInfo() {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.abilityInfo_ = null;
                    this.abilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAbilityInfoBuilder() {
                this.onChanged();
                return this.getAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
                if (this.abilityInfoBuilder_ != null) {
                    return this.abilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getAbilityInfoFieldBuilder() {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.abilityInfo_ = null;
                }
                return this.abilityInfoBuilder_;
            }
            
            private MapField<Integer, Integer> internalGetAffixMap() {
                if (this.affixMap_ == null) {
                    return MapField.emptyMapField(AffixMapDefaultEntryHolder.defaultEntry);
                }
                return this.affixMap_;
            }
            
            private MapField<Integer, Integer> internalGetMutableAffixMap() {
                this.onChanged();
                if (this.affixMap_ == null) {
                    this.affixMap_ = MapField.newMapField(AffixMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.affixMap_.isMutable()) {
                    this.affixMap_ = this.affixMap_.copy();
                }
                return this.affixMap_;
            }
            
            @Override
            public int getAffixMapCount() {
                return this.internalGetAffixMap().getMap().size();
            }
            
            @Override
            public boolean containsAffixMap(final int key) {
                return this.internalGetAffixMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, Integer> getAffixMap() {
                return this.getAffixMapMap();
            }
            
            @Override
            public Map<Integer, Integer> getAffixMapMap() {
                return this.internalGetAffixMap().getMap();
            }
            
            @Override
            public int getAffixMapOrDefault(final int key, final int defaultValue) {
                final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public int getAffixMapOrThrow(final int key) {
                final Map<Integer, Integer> map = this.internalGetAffixMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearAffixMap() {
                this.internalGetMutableAffixMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeAffixMap(final int key) {
                this.internalGetMutableAffixMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, Integer> getMutableAffixMap() {
                return this.internalGetMutableAffixMap().getMutableMap();
            }
            
            public Builder putAffixMap(final int key, final int value) {
                this.internalGetMutableAffixMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllAffixMap(final Map<Integer, Integer> values) {
                this.internalGetMutableAffixMap().getMutableMap().putAll(values);
                return this;
            }
            
            @Override
            public boolean hasRendererChangedInfo() {
                return this.rendererChangedInfoBuilder_ != null || this.rendererChangedInfo_ != null;
            }
            
            @Override
            public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo() {
                if (this.rendererChangedInfoBuilder_ == null) {
                    return (this.rendererChangedInfo_ == null) ? EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : this.rendererChangedInfo_;
                }
                return this.rendererChangedInfoBuilder_.getMessage();
            }
            
            public Builder setRendererChangedInfo(final EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo value) {
                if (this.rendererChangedInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rendererChangedInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRendererChangedInfo(final EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder builderForValue) {
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRendererChangedInfo(final EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo value) {
                if (this.rendererChangedInfoBuilder_ == null) {
                    if (this.rendererChangedInfo_ != null) {
                        this.rendererChangedInfo_ = EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.newBuilder(this.rendererChangedInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rendererChangedInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRendererChangedInfo() {
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfo_ = null;
                    this.rendererChangedInfoBuilder_ = null;
                }
                return this;
            }
            
            public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder getRendererChangedInfoBuilder() {
                this.onChanged();
                return this.getRendererChangedInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder() {
                if (this.rendererChangedInfoBuilder_ != null) {
                    return this.rendererChangedInfoBuilder_.getMessageOrBuilder();
                }
                return (this.rendererChangedInfo_ == null) ? EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : this.rendererChangedInfo_;
            }
            
            private SingleFieldBuilderV3<EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder> getRendererChangedInfoFieldBuilder() {
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfoBuilder_ = new SingleFieldBuilderV3<EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder>(this.getRendererChangedInfo(), this.getParentForChildren(), this.isClean());
                    this.rendererChangedInfo_ = null;
                }
                return this.rendererChangedInfoBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneWeaponInfoOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        int getGadgetId();
        
        int getItemId();
        
        long getGuid();
        
        int getLevel();
        
        int getPromoteLevel();
        
        boolean hasAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();
        
        int getAffixMapCount();
        
        boolean containsAffixMap(final int p0);
        
        @Deprecated
        Map<Integer, Integer> getAffixMap();
        
        Map<Integer, Integer> getAffixMapMap();
        
        int getAffixMapOrDefault(final int p0, final int p1);
        
        int getAffixMapOrThrow(final int p0);
        
        boolean hasRendererChangedInfo();
        
        EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo();
        
        EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder();
    }
}
