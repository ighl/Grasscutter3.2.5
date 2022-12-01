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

public final class ForgeDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ForgeDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeDataNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ForgeDataNotify_ForgeQueueMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeDataNotify_ForgeQueueMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ForgeDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForgeDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015ForgeDataNotify.proto\u001a\u0014ForgeQueueData.proto\"\u00c4\u0001\n\u000fForgeDataNotify\u0012\u0015\n\rforge_id_list\u0018\u0005 \u0003(\r\u0012<\n\u000fforge_queue_map\u0018\b \u0003(\u000b2#.ForgeDataNotify.ForgeQueueMapEntry\u0012\u0015\n\rmax_queue_num\u0018\u000e \u0001(\r\u001aE\n\u0012ForgeQueueMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001e\n\u0005value\u0018\u0002 \u0001(\u000b2\u000f.ForgeQueueData:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForgeDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ForgeQueueDataOuterClass.getDescriptor() });
        internal_static_ForgeDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ForgeDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_descriptor, new String[] { "ForgeIdList", "ForgeQueueMap", "MaxQueueNum" });
        internal_static_ForgeDataNotify_ForgeQueueMapEntry_descriptor = ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_descriptor.getNestedTypes().get(0);
        internal_static_ForgeDataNotify_ForgeQueueMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_ForgeQueueMapEntry_descriptor, new String[] { "Key", "Value" });
        ForgeQueueDataOuterClass.getDescriptor();
    }
    
    public static final class ForgeDataNotify extends GeneratedMessageV3 implements ForgeDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FORGE_ID_LIST_FIELD_NUMBER = 5;
        private Internal.IntList forgeIdList_;
        private int forgeIdListMemoizedSerializedSize;
        public static final int FORGE_QUEUE_MAP_FIELD_NUMBER = 8;
        private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
        public static final int MAX_QUEUE_NUM_FIELD_NUMBER = 14;
        private int maxQueueNum_;
        private byte memoizedIsInitialized;
        private static final ForgeDataNotify DEFAULT_INSTANCE;
        private static final Parser<ForgeDataNotify> PARSER;
        
        private ForgeDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.forgeIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ForgeDataNotify() {
            this.forgeIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.forgeIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ForgeDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ForgeDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.forgeIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.forgeIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.forgeIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.forgeIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 66: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.forgeQueueMap_ = MapField.newMapField(ForgeQueueMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x2;
                            }
                            final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap__ = input.readMessage(ForgeQueueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.forgeQueueMap_.getMutableMap().put(forgeQueueMap__.getKey(), forgeQueueMap__.getValue());
                            continue;
                        }
                        case 112: {
                            this.maxQueueNum_ = input.readUInt32();
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
                    this.forgeIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 8: {
                    return this.internalGetForgeQueueMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeDataNotify.class, Builder.class);
        }
        
        @Override
        public List<Integer> getForgeIdListList() {
            return this.forgeIdList_;
        }
        
        @Override
        public int getForgeIdListCount() {
            return this.forgeIdList_.size();
        }
        
        @Override
        public int getForgeIdList(final int index) {
            return this.forgeIdList_.getInt(index);
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
            this.getSerializedSize();
            if (this.getForgeIdListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.forgeIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.forgeIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.forgeIdList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetForgeQueueMap(), ForgeQueueMapDefaultEntryHolder.defaultEntry, 8);
            if (this.maxQueueNum_ != 0) {
                output.writeUInt32(14, this.maxQueueNum_);
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
            for (int i = 0; i < this.forgeIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.forgeIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getForgeIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.forgeIdListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> entry : this.internalGetForgeQueueMap().getMap().entrySet()) {
                final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap__ = ForgeQueueMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(8, forgeQueueMap__);
            }
            if (this.maxQueueNum_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.maxQueueNum_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForgeDataNotify)) {
                return super.equals(obj);
            }
            final ForgeDataNotify other = (ForgeDataNotify)obj;
            return this.getForgeIdListList().equals(other.getForgeIdListList()) && this.internalGetForgeQueueMap().equals(other.internalGetForgeQueueMap()) && this.getMaxQueueNum() == other.getMaxQueueNum() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getForgeIdListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getForgeIdListList().hashCode();
            }
            if (!this.internalGetForgeQueueMap().getMap().isEmpty()) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.internalGetForgeQueueMap().hashCode();
            }
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getMaxQueueNum();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ForgeDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ForgeDataNotify.PARSER.parseFrom(data);
        }
        
        public static ForgeDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ForgeDataNotify.PARSER.parseFrom(data);
        }
        
        public static ForgeDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ForgeDataNotify.PARSER.parseFrom(data);
        }
        
        public static ForgeDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeDataNotify.PARSER, input);
        }
        
        public static ForgeDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ForgeDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeDataNotify.PARSER, input);
        }
        
        public static ForgeDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ForgeDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeDataNotify.PARSER, input);
        }
        
        public static ForgeDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ForgeDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ForgeDataNotify prototype) {
            return ForgeDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ForgeDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ForgeDataNotify getDefaultInstance() {
            return ForgeDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ForgeDataNotify> parser() {
            return ForgeDataNotify.PARSER;
        }
        
        @Override
        public Parser<ForgeDataNotify> getParserForType() {
            return ForgeDataNotify.PARSER;
        }
        
        @Override
        public ForgeDataNotify getDefaultInstanceForType() {
            return ForgeDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ForgeDataNotify();
            PARSER = new AbstractParser<ForgeDataNotify>() {
                @Override
                public ForgeDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ForgeDataNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class ForgeQueueMapDefaultEntryHolder
        {
            static final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_ForgeQueueMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForgeDataNotifyOrBuilder
        {
            private int bitField0_;
            private Internal.IntList forgeIdList_;
            private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
            private int maxQueueNum_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 8: {
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
                    case 8: {
                        return this.internalGetMutableForgeQueueMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.forgeIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.forgeIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ForgeDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.forgeIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.internalGetMutableForgeQueueMap().clear();
                this.maxQueueNum_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ForgeDataNotifyOuterClass.internal_static_ForgeDataNotify_descriptor;
            }
            
            @Override
            public ForgeDataNotify getDefaultInstanceForType() {
                return ForgeDataNotify.getDefaultInstance();
            }
            
            @Override
            public ForgeDataNotify build() {
                final ForgeDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ForgeDataNotify buildPartial() {
                final ForgeDataNotify result = new ForgeDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.forgeIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.forgeIdList_ = this.forgeIdList_;
                (result.forgeQueueMap_ = this.internalGetForgeQueueMap()).makeImmutable();
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
                if (other instanceof ForgeDataNotify) {
                    return this.mergeFrom((ForgeDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ForgeDataNotify other) {
                if (other == ForgeDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (!other.forgeIdList_.isEmpty()) {
                    if (this.forgeIdList_.isEmpty()) {
                        this.forgeIdList_ = other.forgeIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureForgeIdListIsMutable();
                        this.forgeIdList_.addAll(other.forgeIdList_);
                    }
                    this.onChanged();
                }
                this.internalGetMutableForgeQueueMap().mergeFrom(other.internalGetForgeQueueMap());
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
                ForgeDataNotify parsedMessage = null;
                try {
                    parsedMessage = ForgeDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ForgeDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureForgeIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.forgeIdList_ = GeneratedMessageV3.mutableCopy(this.forgeIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getForgeIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.forgeIdList_) : this.forgeIdList_;
            }
            
            @Override
            public int getForgeIdListCount() {
                return this.forgeIdList_.size();
            }
            
            @Override
            public int getForgeIdList(final int index) {
                return this.forgeIdList_.getInt(index);
            }
            
            public Builder setForgeIdList(final int index, final int value) {
                this.ensureForgeIdListIsMutable();
                this.forgeIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addForgeIdList(final int value) {
                this.ensureForgeIdListIsMutable();
                this.forgeIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllForgeIdList(final Iterable<? extends Integer> values) {
                this.ensureForgeIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.forgeIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearForgeIdList() {
                this.forgeIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
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
    
    public interface ForgeDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<Integer> getForgeIdListList();
        
        int getForgeIdListCount();
        
        int getForgeIdList(final int p0);
        
        int getForgeQueueMapCount();
        
        boolean containsForgeQueueMap(final int p0);
        
        @Deprecated
        Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap();
        
        Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap();
        
        ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(final int p0, final ForgeQueueDataOuterClass.ForgeQueueData p1);
        
        ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(final int p0);
        
        int getMaxQueueNum();
    }
}
