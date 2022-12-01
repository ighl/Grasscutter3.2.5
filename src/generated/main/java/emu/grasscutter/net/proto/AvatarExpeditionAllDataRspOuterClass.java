// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.WireFormat;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.google.protobuf.CodedOutputStream;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.MapField;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class AvatarExpeditionAllDataRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionAllDataRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionAllDataRsp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionAllDataRsp_ExpeditionInfoMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionAllDataRsp_ExpeditionInfoMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionAllDataRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionAllDataRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AvatarExpeditionAllDataRsp.proto\u001a\u001aAvatarExpeditionInfo.proto\"\u008d\u0002\n\u001aAvatarExpeditionAllDataRsp\u0012\u001c\n\u0014open_expedition_list\u0018\u0003 \u0003(\r\u0012\u000f\n\u0007retcode\u0018\u000f \u0001(\u0005\u0012\u001e\n\u0016expedition_count_limit\u0018\f \u0001(\r\u0012O\n\u0013expedition_info_map\u0018\u0004 \u0003(\u000b22.AvatarExpeditionAllDataRsp.ExpeditionInfoMapEntry\u001aO\n\u0016ExpeditionInfoMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0004\u0012$\n\u0005value\u0018\u0002 \u0001(\u000b2\u0015.AvatarExpeditionInfo:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionAllDataRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarExpeditionInfoOuterClass.getDescriptor() });
        internal_static_AvatarExpeditionAllDataRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExpeditionAllDataRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_descriptor, new String[] { "OpenExpeditionList", "Retcode", "ExpeditionCountLimit", "ExpeditionInfoMap" });
        internal_static_AvatarExpeditionAllDataRsp_ExpeditionInfoMapEntry_descriptor = AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_descriptor.getNestedTypes().get(0);
        internal_static_AvatarExpeditionAllDataRsp_ExpeditionInfoMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_ExpeditionInfoMapEntry_descriptor, new String[] { "Key", "Value" });
        AvatarExpeditionInfoOuterClass.getDescriptor();
    }
    
    public static final class AvatarExpeditionAllDataRsp extends GeneratedMessageV3 implements AvatarExpeditionAllDataRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OPEN_EXPEDITION_LIST_FIELD_NUMBER = 3;
        private Internal.IntList openExpeditionList_;
        private int openExpeditionListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 15;
        private int retcode_;
        public static final int EXPEDITION_COUNT_LIMIT_FIELD_NUMBER = 12;
        private int expeditionCountLimit_;
        public static final int EXPEDITION_INFO_MAP_FIELD_NUMBER = 4;
        private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
        private byte memoizedIsInitialized;
        private static final AvatarExpeditionAllDataRsp DEFAULT_INSTANCE;
        private static final Parser<AvatarExpeditionAllDataRsp> PARSER;
        
        private AvatarExpeditionAllDataRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.openExpeditionListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExpeditionAllDataRsp() {
            this.openExpeditionListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.openExpeditionList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExpeditionAllDataRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExpeditionAllDataRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.openExpeditionList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.openExpeditionList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.openExpeditionList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.openExpeditionList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 34: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.expeditionInfoMap_ = MapField.newMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap__ = input.readMessage(ExpeditionInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.expeditionInfoMap_.getMutableMap().put(expeditionInfoMap__.getKey(), expeditionInfoMap__.getValue());
                            continue;
                        }
                        case 96: {
                            this.expeditionCountLimit_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.retcode_ = input.readInt32();
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.openExpeditionList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 4: {
                    return this.internalGetExpeditionInfoMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionAllDataRsp.class, Builder.class);
        }
        
        @Override
        public List<Integer> getOpenExpeditionListList() {
            return this.openExpeditionList_;
        }
        
        @Override
        public int getOpenExpeditionListCount() {
            return this.openExpeditionList_.size();
        }
        
        @Override
        public int getOpenExpeditionList(final int index) {
            return this.openExpeditionList_.getInt(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getExpeditionCountLimit() {
            return this.expeditionCountLimit_;
        }
        
        private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetExpeditionInfoMap() {
            if (this.expeditionInfoMap_ == null) {
                return MapField.emptyMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
            }
            return this.expeditionInfoMap_;
        }
        
        @Override
        public int getExpeditionInfoMapCount() {
            return this.internalGetExpeditionInfoMap().getMap().size();
        }
        
        @Override
        public boolean containsExpeditionInfoMap(final long key) {
            return this.internalGetExpeditionInfoMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
            return this.getExpeditionInfoMapMap();
        }
        
        @Override
        public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
            return this.internalGetExpeditionInfoMap().getMap();
        }
        
        @Override
        public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
            final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long key) {
            final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
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
            this.getSerializedSize();
            if (this.getOpenExpeditionListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.openExpeditionListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.openExpeditionList_.size(); ++i) {
                output.writeUInt32NoTag(this.openExpeditionList_.getInt(i));
            }
            GeneratedMessageV3.serializeLongMapTo(output, this.internalGetExpeditionInfoMap(), ExpeditionInfoMapDefaultEntryHolder.defaultEntry, 4);
            if (this.expeditionCountLimit_ != 0) {
                output.writeUInt32(12, this.expeditionCountLimit_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(15, this.retcode_);
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
            int dataSize = 0;
            for (int i = 0; i < this.openExpeditionList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.openExpeditionList_.getInt(i));
            }
            size += dataSize;
            if (!this.getOpenExpeditionListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.openExpeditionListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> entry : this.internalGetExpeditionInfoMap().getMap().entrySet()) {
                final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap__ = ExpeditionInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(4, expeditionInfoMap__);
            }
            if (this.expeditionCountLimit_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.expeditionCountLimit_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(15, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExpeditionAllDataRsp)) {
                return super.equals(obj);
            }
            final AvatarExpeditionAllDataRsp other = (AvatarExpeditionAllDataRsp)obj;
            return this.getOpenExpeditionListList().equals(other.getOpenExpeditionListList()) && this.getRetcode() == other.getRetcode() && this.getExpeditionCountLimit() == other.getExpeditionCountLimit() && this.internalGetExpeditionInfoMap().equals(other.internalGetExpeditionInfoMap()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOpenExpeditionListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getOpenExpeditionListList().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getExpeditionCountLimit();
            if (!this.internalGetExpeditionInfoMap().getMap().isEmpty()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.internalGetExpeditionInfoMap().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExpeditionAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExpeditionAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExpeditionAllDataRsp.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionAllDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionAllDataRsp.PARSER, input);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionAllDataRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionAllDataRsp.PARSER, input);
        }
        
        public static AvatarExpeditionAllDataRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionAllDataRsp.PARSER, input);
        }
        
        public static AvatarExpeditionAllDataRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionAllDataRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExpeditionAllDataRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExpeditionAllDataRsp prototype) {
            return AvatarExpeditionAllDataRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExpeditionAllDataRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExpeditionAllDataRsp getDefaultInstance() {
            return AvatarExpeditionAllDataRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExpeditionAllDataRsp> parser() {
            return AvatarExpeditionAllDataRsp.PARSER;
        }
        
        @Override
        public Parser<AvatarExpeditionAllDataRsp> getParserForType() {
            return AvatarExpeditionAllDataRsp.PARSER;
        }
        
        @Override
        public AvatarExpeditionAllDataRsp getDefaultInstanceForType() {
            return AvatarExpeditionAllDataRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExpeditionAllDataRsp();
            PARSER = new AbstractParser<AvatarExpeditionAllDataRsp>() {
                @Override
                public AvatarExpeditionAllDataRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExpeditionAllDataRsp(input, extensionRegistry);
                }
            };
        }
        
        private static final class ExpeditionInfoMapDefaultEntryHolder
        {
            static final MapEntry<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_ExpeditionInfoMapEntry_descriptor, WireFormat.FieldType.UINT64, 0L, WireFormat.FieldType.MESSAGE, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExpeditionAllDataRspOrBuilder
        {
            private int bitField0_;
            private Internal.IntList openExpeditionList_;
            private int retcode_;
            private int expeditionCountLimit_;
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> expeditionInfoMap_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 4: {
                        return this.internalGetExpeditionInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 4: {
                        return this.internalGetMutableExpeditionInfoMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionAllDataRsp.class, Builder.class);
            }
            
            private Builder() {
                this.openExpeditionList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.openExpeditionList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExpeditionAllDataRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.openExpeditionList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.retcode_ = 0;
                this.expeditionCountLimit_ = 0;
                this.internalGetMutableExpeditionInfoMap().clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExpeditionAllDataRspOuterClass.internal_static_AvatarExpeditionAllDataRsp_descriptor;
            }
            
            @Override
            public AvatarExpeditionAllDataRsp getDefaultInstanceForType() {
                return AvatarExpeditionAllDataRsp.getDefaultInstance();
            }
            
            @Override
            public AvatarExpeditionAllDataRsp build() {
                final AvatarExpeditionAllDataRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExpeditionAllDataRsp buildPartial() {
                final AvatarExpeditionAllDataRsp result = new AvatarExpeditionAllDataRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.openExpeditionList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.openExpeditionList_ = this.openExpeditionList_;
                result.retcode_ = this.retcode_;
                result.expeditionCountLimit_ = this.expeditionCountLimit_;
                (result.expeditionInfoMap_ = this.internalGetExpeditionInfoMap()).makeImmutable();
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
                if (other instanceof AvatarExpeditionAllDataRsp) {
                    return this.mergeFrom((AvatarExpeditionAllDataRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExpeditionAllDataRsp other) {
                if (other == AvatarExpeditionAllDataRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.openExpeditionList_.isEmpty()) {
                    if (this.openExpeditionList_.isEmpty()) {
                        this.openExpeditionList_ = other.openExpeditionList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureOpenExpeditionListIsMutable();
                        this.openExpeditionList_.addAll(other.openExpeditionList_);
                    }
                    this.onChanged();
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getExpeditionCountLimit() != 0) {
                    this.setExpeditionCountLimit(other.getExpeditionCountLimit());
                }
                this.internalGetMutableExpeditionInfoMap().mergeFrom(other.internalGetExpeditionInfoMap());
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
                AvatarExpeditionAllDataRsp parsedMessage = null;
                try {
                    parsedMessage = AvatarExpeditionAllDataRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExpeditionAllDataRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureOpenExpeditionListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.openExpeditionList_ = GeneratedMessageV3.mutableCopy(this.openExpeditionList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getOpenExpeditionListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.openExpeditionList_) : this.openExpeditionList_;
            }
            
            @Override
            public int getOpenExpeditionListCount() {
                return this.openExpeditionList_.size();
            }
            
            @Override
            public int getOpenExpeditionList(final int index) {
                return this.openExpeditionList_.getInt(index);
            }
            
            public Builder setOpenExpeditionList(final int index, final int value) {
                this.ensureOpenExpeditionListIsMutable();
                this.openExpeditionList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addOpenExpeditionList(final int value) {
                this.ensureOpenExpeditionListIsMutable();
                this.openExpeditionList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllOpenExpeditionList(final Iterable<? extends Integer> values) {
                this.ensureOpenExpeditionListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.openExpeditionList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearOpenExpeditionList() {
                this.openExpeditionList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getExpeditionCountLimit() {
                return this.expeditionCountLimit_;
            }
            
            public Builder setExpeditionCountLimit(final int value) {
                this.expeditionCountLimit_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExpeditionCountLimit() {
                this.expeditionCountLimit_ = 0;
                this.onChanged();
                return this;
            }
            
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetExpeditionInfoMap() {
                if (this.expeditionInfoMap_ == null) {
                    return MapField.emptyMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                }
                return this.expeditionInfoMap_;
            }
            
            private MapField<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> internalGetMutableExpeditionInfoMap() {
                this.onChanged();
                if (this.expeditionInfoMap_ == null) {
                    this.expeditionInfoMap_ = MapField.newMapField(ExpeditionInfoMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.expeditionInfoMap_.isMutable()) {
                    this.expeditionInfoMap_ = this.expeditionInfoMap_.copy();
                }
                return this.expeditionInfoMap_;
            }
            
            @Override
            public int getExpeditionInfoMapCount() {
                return this.internalGetExpeditionInfoMap().getMap().size();
            }
            
            @Override
            public boolean containsExpeditionInfoMap(final long key) {
                return this.internalGetExpeditionInfoMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap() {
                return this.getExpeditionInfoMapMap();
            }
            
            @Override
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap() {
                return this.internalGetExpeditionInfoMap().getMap();
            }
            
            @Override
            public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo defaultValue) {
                final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long key) {
                final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> map = this.internalGetExpeditionInfoMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearExpeditionInfoMap() {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeExpeditionInfoMap(final long key) {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getMutableExpeditionInfoMap() {
                return this.internalGetMutableExpeditionInfoMap().getMutableMap();
            }
            
            public Builder putExpeditionInfoMap(final long key, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableExpeditionInfoMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllExpeditionInfoMap(final Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> values) {
                this.internalGetMutableExpeditionInfoMap().getMutableMap().putAll(values);
                return this;
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
    
    public interface AvatarExpeditionAllDataRspOrBuilder extends MessageOrBuilder
    {
        List<Integer> getOpenExpeditionListList();
        
        int getOpenExpeditionListCount();
        
        int getOpenExpeditionList(final int p0);
        
        int getRetcode();
        
        int getExpeditionCountLimit();
        
        int getExpeditionInfoMapCount();
        
        boolean containsExpeditionInfoMap(final long p0);
        
        @Deprecated
        Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMap();
        
        Map<Long, AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo> getExpeditionInfoMapMap();
        
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrDefault(final long p0, final AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo p1);
        
        AvatarExpeditionInfoOuterClass.AvatarExpeditionInfo getExpeditionInfoMapOrThrow(final long p0);
    }
}
