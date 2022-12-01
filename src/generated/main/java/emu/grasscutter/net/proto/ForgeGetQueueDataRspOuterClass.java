// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
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

public final class ForgeGetQueueDataRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_ForgeGetQueueDataRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeGetQueueDataRsp_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ForgeGetQueueDataRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForgeGetQueueDataRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aForgeGetQueueDataRsp.proto\u001a\u0014ForgeQueueData.proto\"\u00c8\u0001\n\u0014ForgeGetQueueDataRsp\u0012A\n\u000fforge_queue_map\u0018\u0002 \u0003(\u000b2(.ForgeGetQueueDataRsp.ForgeQueueMapEntry\u0012\u000f\n\u0007retcode\u0018\u000f \u0001(\u0005\u0012\u0015\n\rmax_queue_num\u0018\u0006 \u0001(\r\u001aE\n\u0012ForgeQueueMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001e\n\u0005value\u0018\u0002 \u0001(\u000b2\u000f.ForgeQueueData:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForgeGetQueueDataRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ForgeQueueDataOuterClass.getDescriptor() });
        internal_static_ForgeGetQueueDataRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ForgeGetQueueDataRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor, new String[] { "ForgeQueueMap", "Retcode", "MaxQueueNum" });
        internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor = ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor.getNestedTypes().get(0);
        internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor, new String[] { "Key", "Value" });
        ForgeQueueDataOuterClass.getDescriptor();
    }
    
    public static final class ForgeGetQueueDataRsp extends GeneratedMessageV3 implements ForgeGetQueueDataRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FORGE_QUEUE_MAP_FIELD_NUMBER = 2;
        private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
        public static final int RETCODE_FIELD_NUMBER = 15;
        private int retcode_;
        public static final int MAX_QUEUE_NUM_FIELD_NUMBER = 6;
        private int maxQueueNum_;
        private byte memoizedIsInitialized;
        private static final ForgeGetQueueDataRsp DEFAULT_INSTANCE;
        private static final Parser<ForgeGetQueueDataRsp> PARSER;
        
        private ForgeGetQueueDataRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ForgeGetQueueDataRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ForgeGetQueueDataRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ForgeGetQueueDataRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.forgeQueueMap_ = MapField.newMapField(ForgeQueueMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap__ = input.readMessage(ForgeQueueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.forgeQueueMap_.getMutableMap().put(forgeQueueMap__.getKey(), forgeQueueMap__.getValue());
                            continue;
                        }
                        case 48: {
                            this.maxQueueNum_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 2: {
                    return this.internalGetForgeQueueMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeGetQueueDataRsp.class, Builder.class);
        }
        
        private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> internalGetForgeQueueMap() {
            if (this.forgeQueueMap_ == null) {
                return MapField.emptyMapField(ForgeQueueMapDefaultEntryHolder.defaultEntry);
            }
            return this.forgeQueueMap_;
        }
        
        @Override
        public int getForgeQueueMapCount() {
            return this.internalGetForgeQueueMap().getMap().size();
        }
        
        @Override
        public boolean containsForgeQueueMap(final int key) {
            return this.internalGetForgeQueueMap().getMap().containsKey(key);
        }
        
        @Deprecated
        @Override
        public Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap() {
            return this.getForgeQueueMapMap();
        }
        
        @Override
        public Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap() {
            return this.internalGetForgeQueueMap().getMap();
        }
        
        @Override
        public ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(final int key, final ForgeQueueDataOuterClass.ForgeQueueData defaultValue) {
            final Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> map = this.internalGetForgeQueueMap().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        
        @Override
        public ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(final int key) {
            final Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> map = this.internalGetForgeQueueMap().getMap();
            if (!map.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return map.get(key);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getMaxQueueNum() {
            return this.maxQueueNum_;
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
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetForgeQueueMap(), ForgeQueueMapDefaultEntryHolder.defaultEntry, 2);
            if (this.maxQueueNum_ != 0) {
                output.writeUInt32(6, this.maxQueueNum_);
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
            for (final Map.Entry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> entry : this.internalGetForgeQueueMap().getMap().entrySet()) {
                final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap__ = ForgeQueueMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(2, forgeQueueMap__);
            }
            if (this.maxQueueNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.maxQueueNum_);
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
            if (!(obj instanceof ForgeGetQueueDataRsp)) {
                return super.equals(obj);
            }
            final ForgeGetQueueDataRsp other = (ForgeGetQueueDataRsp)obj;
            return this.internalGetForgeQueueMap().equals(other.internalGetForgeQueueMap()) && this.getRetcode() == other.getRetcode() && this.getMaxQueueNum() == other.getMaxQueueNum() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetForgeQueueMap().getMap().isEmpty()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.internalGetForgeQueueMap().hashCode();
            }
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getMaxQueueNum();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ForgeGetQueueDataRsp.PARSER.parseFrom(data);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeGetQueueDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ForgeGetQueueDataRsp.PARSER.parseFrom(data);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeGetQueueDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ForgeGetQueueDataRsp.PARSER.parseFrom(data);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeGetQueueDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeGetQueueDataRsp.PARSER, input);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeGetQueueDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static ForgeGetQueueDataRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeGetQueueDataRsp.PARSER, input);
        }
        
        public static ForgeGetQueueDataRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeGetQueueDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeGetQueueDataRsp.PARSER, input);
        }
        
        public static ForgeGetQueueDataRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeGetQueueDataRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ForgeGetQueueDataRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ForgeGetQueueDataRsp prototype) {
            return ForgeGetQueueDataRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ForgeGetQueueDataRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ForgeGetQueueDataRsp getDefaultInstance() {
            return ForgeGetQueueDataRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<ForgeGetQueueDataRsp> parser() {
            return ForgeGetQueueDataRsp.PARSER;
        }
        
        @Override
        public Parser<ForgeGetQueueDataRsp> getParserForType() {
            return ForgeGetQueueDataRsp.PARSER;
        }
        
        @Override
        public ForgeGetQueueDataRsp getDefaultInstanceForType() {
            return ForgeGetQueueDataRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ForgeGetQueueDataRsp();
            PARSER = new AbstractParser<ForgeGetQueueDataRsp>() {
                @Override
                public ForgeGetQueueDataRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ForgeGetQueueDataRsp(input, extensionRegistry);
                }
            };
        }
        
        private static final class ForgeQueueMapDefaultEntryHolder
        {
            static final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForgeGetQueueDataRspOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
            private int retcode_;
            private int maxQueueNum_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 2: {
                        return this.internalGetForgeQueueMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected MapField internalGetMutableMapField(final int number) {
                switch (number) {
                    case 2: {
                        return this.internalGetMutableForgeQueueMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeGetQueueDataRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ForgeGetQueueDataRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableForgeQueueMap().clear();
                this.retcode_ = 0;
                this.maxQueueNum_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ForgeGetQueueDataRspOuterClass.internal_static_ForgeGetQueueDataRsp_descriptor;
            }
            
            @Override
            public ForgeGetQueueDataRsp getDefaultInstanceForType() {
                return ForgeGetQueueDataRsp.getDefaultInstance();
            }
            
            @Override
            public ForgeGetQueueDataRsp build() {
                final ForgeGetQueueDataRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ForgeGetQueueDataRsp buildPartial() {
                final ForgeGetQueueDataRsp result = new ForgeGetQueueDataRsp(this);
                final int from_bitField0_ = this.bitField0_;
                (result.forgeQueueMap_ = this.internalGetForgeQueueMap()).makeImmutable();
                result.retcode_ = this.retcode_;
                result.maxQueueNum_ = this.maxQueueNum_;
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
                if (other instanceof ForgeGetQueueDataRsp) {
                    return this.mergeFrom((ForgeGetQueueDataRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ForgeGetQueueDataRsp other) {
                if (other == ForgeGetQueueDataRsp.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableForgeQueueMap().mergeFrom(other.internalGetForgeQueueMap());
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getMaxQueueNum() != 0) {
                    this.setMaxQueueNum(other.getMaxQueueNum());
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
                ForgeGetQueueDataRsp parsedMessage = null;
                try {
                    parsedMessage = ForgeGetQueueDataRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ForgeGetQueueDataRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> internalGetForgeQueueMap() {
                if (this.forgeQueueMap_ == null) {
                    return MapField.emptyMapField(ForgeQueueMapDefaultEntryHolder.defaultEntry);
                }
                return this.forgeQueueMap_;
            }
            
            private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> internalGetMutableForgeQueueMap() {
                this.onChanged();
                if (this.forgeQueueMap_ == null) {
                    this.forgeQueueMap_ = MapField.newMapField(ForgeQueueMapDefaultEntryHolder.defaultEntry);
                }
                if (!this.forgeQueueMap_.isMutable()) {
                    this.forgeQueueMap_ = this.forgeQueueMap_.copy();
                }
                return this.forgeQueueMap_;
            }
            
            @Override
            public int getForgeQueueMapCount() {
                return this.internalGetForgeQueueMap().getMap().size();
            }
            
            @Override
            public boolean containsForgeQueueMap(final int key) {
                return this.internalGetForgeQueueMap().getMap().containsKey(key);
            }
            
            @Deprecated
            @Override
            public Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap() {
                return this.getForgeQueueMapMap();
            }
            
            @Override
            public Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap() {
                return this.internalGetForgeQueueMap().getMap();
            }
            
            @Override
            public ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(final int key, final ForgeQueueDataOuterClass.ForgeQueueData defaultValue) {
                final Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> map = this.internalGetForgeQueueMap().getMap();
                return map.containsKey(key) ? map.get(key) : defaultValue;
            }
            
            @Override
            public ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(final int key) {
                final Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> map = this.internalGetForgeQueueMap().getMap();
                if (!map.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return map.get(key);
            }
            
            public Builder clearForgeQueueMap() {
                this.internalGetMutableForgeQueueMap().getMutableMap().clear();
                return this;
            }
            
            public Builder removeForgeQueueMap(final int key) {
                this.internalGetMutableForgeQueueMap().getMutableMap().remove(key);
                return this;
            }
            
            @Deprecated
            public Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getMutableForgeQueueMap() {
                return this.internalGetMutableForgeQueueMap().getMutableMap();
            }
            
            public Builder putForgeQueueMap(final int key, final ForgeQueueDataOuterClass.ForgeQueueData value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.internalGetMutableForgeQueueMap().getMutableMap().put(key, value);
                return this;
            }
            
            public Builder putAllForgeQueueMap(final Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> values) {
                this.internalGetMutableForgeQueueMap().getMutableMap().putAll(values);
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
            public int getMaxQueueNum() {
                return this.maxQueueNum_;
            }
            
            public Builder setMaxQueueNum(final int value) {
                this.maxQueueNum_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMaxQueueNum() {
                this.maxQueueNum_ = 0;
                this.onChanged();
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
    
    public interface ForgeGetQueueDataRspOrBuilder extends MessageOrBuilder
    {
        int getForgeQueueMapCount();
        
        boolean containsForgeQueueMap(final int p0);
        
        @Deprecated
        Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap();
        
        Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap();
        
        ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(final int p0, final ForgeQueueDataOuterClass.ForgeQueueData p1);
        
        ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(final int p0);
        
        int getRetcode();
        
        int getMaxQueueNum();
    }
}
