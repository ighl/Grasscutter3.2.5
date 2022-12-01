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
import java.util.List;
import java.util.Map;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MapEntry;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.MapField;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ForgeQueueDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ForgeQueueDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeQueueDataNotify_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_ForgeQueueDataNotify_ForgeQueueMapEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ForgeQueueDataNotify_ForgeQueueMapEntry_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ForgeQueueDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ForgeQueueDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aForgeQueueDataNotify.proto\u001a\u0014ForgeQueueData.proto\"\u00c2\u0001\n\u0014ForgeQueueDataNotify\u0012A\n\u000fforge_queue_map\u0018\u0007 \u0003(\u000b2(.ForgeQueueDataNotify.ForgeQueueMapEntry\u0012 \n\u0018removed_forge_queue_list\u0018\u0006 \u0003(\r\u001aE\n\u0012ForgeQueueMapEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\r\u0012\u001e\n\u0005value\u0018\u0002 \u0001(\u000b2\u000f.ForgeQueueData:\u00028\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ForgeQueueDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ForgeQueueDataOuterClass.getDescriptor() });
        internal_static_ForgeQueueDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ForgeQueueDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_descriptor, new String[] { "ForgeQueueMap", "RemovedForgeQueueList" });
        internal_static_ForgeQueueDataNotify_ForgeQueueMapEntry_descriptor = ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_descriptor.getNestedTypes().get(0);
        internal_static_ForgeQueueDataNotify_ForgeQueueMapEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_ForgeQueueMapEntry_descriptor, new String[] { "Key", "Value" });
        ForgeQueueDataOuterClass.getDescriptor();
    }
    
    public static final class ForgeQueueDataNotify extends GeneratedMessageV3 implements ForgeQueueDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FORGE_QUEUE_MAP_FIELD_NUMBER = 7;
        private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
        public static final int REMOVED_FORGE_QUEUE_LIST_FIELD_NUMBER = 6;
        private Internal.IntList removedForgeQueueList_;
        private int removedForgeQueueListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ForgeQueueDataNotify DEFAULT_INSTANCE;
        private static final Parser<ForgeQueueDataNotify> PARSER;
        
        private ForgeQueueDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.removedForgeQueueListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ForgeQueueDataNotify() {
            this.removedForgeQueueListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.removedForgeQueueList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ForgeQueueDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ForgeQueueDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.removedForgeQueueList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.removedForgeQueueList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.removedForgeQueueList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.removedForgeQueueList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.forgeQueueMap_ = MapField.newMapField(ForgeQueueMapDefaultEntryHolder.defaultEntry);
                                mutable_bitField0_ |= 0x1;
                            }
                            final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap__ = input.readMessage(ForgeQueueMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            this.forgeQueueMap_.getMutableMap().put(forgeQueueMap__.getKey(), forgeQueueMap__.getValue());
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.removedForgeQueueList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_descriptor;
        }
        
        @Override
        protected MapField internalGetMapField(final int number) {
            switch (number) {
                case 7: {
                    return this.internalGetForgeQueueMap();
                }
                default: {
                    throw new RuntimeException("Invalid map field number: " + number);
                }
            }
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueDataNotify.class, Builder.class);
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
        public List<Integer> getRemovedForgeQueueListList() {
            return this.removedForgeQueueList_;
        }
        
        @Override
        public int getRemovedForgeQueueListCount() {
            return this.removedForgeQueueList_.size();
        }
        
        @Override
        public int getRemovedForgeQueueList(final int index) {
            return this.removedForgeQueueList_.getInt(index);
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
            if (this.getRemovedForgeQueueListList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.removedForgeQueueListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.removedForgeQueueList_.size(); ++i) {
                output.writeUInt32NoTag(this.removedForgeQueueList_.getInt(i));
            }
            GeneratedMessageV3.serializeIntegerMapTo(output, this.internalGetForgeQueueMap(), ForgeQueueMapDefaultEntryHolder.defaultEntry, 7);
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
            for (int i = 0; i < this.removedForgeQueueList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.removedForgeQueueList_.getInt(i));
            }
            size += dataSize;
            if (!this.getRemovedForgeQueueListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.removedForgeQueueListMemoizedSerializedSize = dataSize;
            for (final Map.Entry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> entry : this.internalGetForgeQueueMap().getMap().entrySet()) {
                final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap__ = ForgeQueueMapDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build();
                size += CodedOutputStream.computeMessageSize(7, forgeQueueMap__);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForgeQueueDataNotify)) {
                return super.equals(obj);
            }
            final ForgeQueueDataNotify other = (ForgeQueueDataNotify)obj;
            return this.internalGetForgeQueueMap().equals(other.internalGetForgeQueueMap()) && this.getRemovedForgeQueueListList().equals(other.getRemovedForgeQueueListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (!this.internalGetForgeQueueMap().getMap().isEmpty()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.internalGetForgeQueueMap().hashCode();
            }
            if (this.getRemovedForgeQueueListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getRemovedForgeQueueListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ForgeQueueDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ForgeQueueDataNotify.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ForgeQueueDataNotify.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ForgeQueueDataNotify.PARSER.parseFrom(data);
        }
        
        public static ForgeQueueDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ForgeQueueDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ForgeQueueDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueDataNotify.PARSER, input);
        }
        
        public static ForgeQueueDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueDataNotify.PARSER, input);
        }
        
        public static ForgeQueueDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ForgeQueueDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static ForgeQueueDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueDataNotify.PARSER, input);
        }
        
        public static ForgeQueueDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ForgeQueueDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ForgeQueueDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ForgeQueueDataNotify prototype) {
            return ForgeQueueDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ForgeQueueDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ForgeQueueDataNotify getDefaultInstance() {
            return ForgeQueueDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ForgeQueueDataNotify> parser() {
            return ForgeQueueDataNotify.PARSER;
        }
        
        @Override
        public Parser<ForgeQueueDataNotify> getParserForType() {
            return ForgeQueueDataNotify.PARSER;
        }
        
        @Override
        public ForgeQueueDataNotify getDefaultInstanceForType() {
            return ForgeQueueDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ForgeQueueDataNotify();
            PARSER = new AbstractParser<ForgeQueueDataNotify>() {
                @Override
                public ForgeQueueDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ForgeQueueDataNotify(input, extensionRegistry);
                }
            };
        }
        
        private static final class ForgeQueueMapDefaultEntryHolder
        {
            static final MapEntry<Integer, ForgeQueueDataOuterClass.ForgeQueueData> defaultEntry;
            
            static {
                defaultEntry = MapEntry.newDefaultInstance(ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_ForgeQueueMapEntry_descriptor, WireFormat.FieldType.UINT32, 0, WireFormat.FieldType.MESSAGE, ForgeQueueDataOuterClass.ForgeQueueData.getDefaultInstance());
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForgeQueueDataNotifyOrBuilder
        {
            private int bitField0_;
            private MapField<Integer, ForgeQueueDataOuterClass.ForgeQueueData> forgeQueueMap_;
            private Internal.IntList removedForgeQueueList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_descriptor;
            }
            
            @Override
            protected MapField internalGetMapField(final int number) {
                switch (number) {
                    case 7: {
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
                    case 7: {
                        return this.internalGetMutableForgeQueueMap();
                    }
                    default: {
                        throw new RuntimeException("Invalid map field number: " + number);
                    }
                }
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ForgeQueueDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.removedForgeQueueList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.removedForgeQueueList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ForgeQueueDataNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.internalGetMutableForgeQueueMap().clear();
                this.removedForgeQueueList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ForgeQueueDataNotifyOuterClass.internal_static_ForgeQueueDataNotify_descriptor;
            }
            
            @Override
            public ForgeQueueDataNotify getDefaultInstanceForType() {
                return ForgeQueueDataNotify.getDefaultInstance();
            }
            
            @Override
            public ForgeQueueDataNotify build() {
                final ForgeQueueDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ForgeQueueDataNotify buildPartial() {
                final ForgeQueueDataNotify result = new ForgeQueueDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                (result.forgeQueueMap_ = this.internalGetForgeQueueMap()).makeImmutable();
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.removedForgeQueueList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.removedForgeQueueList_ = this.removedForgeQueueList_;
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
                if (other instanceof ForgeQueueDataNotify) {
                    return this.mergeFrom((ForgeQueueDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ForgeQueueDataNotify other) {
                if (other == ForgeQueueDataNotify.getDefaultInstance()) {
                    return this;
                }
                this.internalGetMutableForgeQueueMap().mergeFrom(other.internalGetForgeQueueMap());
                if (!other.removedForgeQueueList_.isEmpty()) {
                    if (this.removedForgeQueueList_.isEmpty()) {
                        this.removedForgeQueueList_ = other.removedForgeQueueList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureRemovedForgeQueueListIsMutable();
                        this.removedForgeQueueList_.addAll(other.removedForgeQueueList_);
                    }
                    this.onChanged();
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
                ForgeQueueDataNotify parsedMessage = null;
                try {
                    parsedMessage = ForgeQueueDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ForgeQueueDataNotify)e.getUnfinishedMessage();
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
            
            private void ensureRemovedForgeQueueListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.removedForgeQueueList_ = GeneratedMessageV3.mutableCopy(this.removedForgeQueueList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getRemovedForgeQueueListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.removedForgeQueueList_) : this.removedForgeQueueList_;
            }
            
            @Override
            public int getRemovedForgeQueueListCount() {
                return this.removedForgeQueueList_.size();
            }
            
            @Override
            public int getRemovedForgeQueueList(final int index) {
                return this.removedForgeQueueList_.getInt(index);
            }
            
            public Builder setRemovedForgeQueueList(final int index, final int value) {
                this.ensureRemovedForgeQueueListIsMutable();
                this.removedForgeQueueList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addRemovedForgeQueueList(final int value) {
                this.ensureRemovedForgeQueueListIsMutable();
                this.removedForgeQueueList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllRemovedForgeQueueList(final Iterable<? extends Integer> values) {
                this.ensureRemovedForgeQueueListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.removedForgeQueueList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearRemovedForgeQueueList() {
                this.removedForgeQueueList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface ForgeQueueDataNotifyOrBuilder extends MessageOrBuilder
    {
        int getForgeQueueMapCount();
        
        boolean containsForgeQueueMap(final int p0);
        
        @Deprecated
        Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMap();
        
        Map<Integer, ForgeQueueDataOuterClass.ForgeQueueData> getForgeQueueMapMap();
        
        ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrDefault(final int p0, final ForgeQueueDataOuterClass.ForgeQueueData p1);
        
        ForgeQueueDataOuterClass.ForgeQueueData getForgeQueueMapOrThrow(final int p0);
        
        List<Integer> getRemovedForgeQueueListList();
        
        int getRemovedForgeQueueListCount();
        
        int getRemovedForgeQueueList(final int p0);
    }
}
