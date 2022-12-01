// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class ReliquaryDecomposeRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_ReliquaryDecomposeRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ReliquaryDecomposeRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ReliquaryDecomposeRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ReliquaryDecomposeRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bReliquaryDecomposeRsp.proto\";\n\u0015ReliquaryDecomposeRsp\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005\u0012\u0011\n\tguid_list\u0018\u000e \u0003(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ReliquaryDecomposeRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_ReliquaryDecomposeRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ReliquaryDecomposeRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_descriptor, new String[] { "Retcode", "GuidList" });
    }
    
    public static final class ReliquaryDecomposeRsp extends GeneratedMessageV3 implements ReliquaryDecomposeRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        public static final int GUID_LIST_FIELD_NUMBER = 14;
        private Internal.LongList guidList_;
        private int guidListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final ReliquaryDecomposeRsp DEFAULT_INSTANCE;
        private static final Parser<ReliquaryDecomposeRsp> PARSER;
        
        private ReliquaryDecomposeRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.guidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private ReliquaryDecomposeRsp() {
            this.guidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.guidList_ = GeneratedMessageV3.emptyLongList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ReliquaryDecomposeRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ReliquaryDecomposeRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 112: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.guidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.guidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 114: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.guidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.guidList_.addLong(input.readUInt64());
                            }
                            input.popLimit(limit);
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
                    this.guidList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryDecomposeRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<Long> getGuidListList() {
            return this.guidList_;
        }
        
        @Override
        public int getGuidListCount() {
            return this.guidList_.size();
        }
        
        @Override
        public long getGuidList(final int index) {
            return this.guidList_.getLong(index);
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
            if (this.retcode_ != 0) {
                output.writeInt32(3, this.retcode_);
            }
            if (this.getGuidListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(this.guidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.guidList_.size(); ++i) {
                output.writeUInt64NoTag(this.guidList_.getLong(i));
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.guidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.guidList_.getLong(i));
            }
            size += dataSize;
            if (!this.getGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.guidListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ReliquaryDecomposeRsp)) {
                return super.equals(obj);
            }
            final ReliquaryDecomposeRsp other = (ReliquaryDecomposeRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getGuidListList().equals(other.getGuidListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            if (this.getGuidListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getGuidListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeRsp.PARSER.parseFrom(data);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeRsp.PARSER.parseFrom(data);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeRsp.PARSER.parseFrom(data);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ReliquaryDecomposeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeRsp.PARSER, input);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeRsp.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryDecomposeRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryDecomposeRsp.PARSER, input);
        }
        
        public static ReliquaryDecomposeRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ReliquaryDecomposeRsp.PARSER, input, extensionRegistry);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeRsp.PARSER, input);
        }
        
        public static ReliquaryDecomposeRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ReliquaryDecomposeRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ReliquaryDecomposeRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ReliquaryDecomposeRsp prototype) {
            return ReliquaryDecomposeRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ReliquaryDecomposeRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ReliquaryDecomposeRsp getDefaultInstance() {
            return ReliquaryDecomposeRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<ReliquaryDecomposeRsp> parser() {
            return ReliquaryDecomposeRsp.PARSER;
        }
        
        @Override
        public Parser<ReliquaryDecomposeRsp> getParserForType() {
            return ReliquaryDecomposeRsp.PARSER;
        }
        
        @Override
        public ReliquaryDecomposeRsp getDefaultInstanceForType() {
            return ReliquaryDecomposeRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ReliquaryDecomposeRsp();
            PARSER = new AbstractParser<ReliquaryDecomposeRsp>() {
                @Override
                public ReliquaryDecomposeRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ReliquaryDecomposeRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ReliquaryDecomposeRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private Internal.LongList guidList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(ReliquaryDecomposeRsp.class, Builder.class);
            }
            
            private Builder() {
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ReliquaryDecomposeRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ReliquaryDecomposeRspOuterClass.internal_static_ReliquaryDecomposeRsp_descriptor;
            }
            
            @Override
            public ReliquaryDecomposeRsp getDefaultInstanceForType() {
                return ReliquaryDecomposeRsp.getDefaultInstance();
            }
            
            @Override
            public ReliquaryDecomposeRsp build() {
                final ReliquaryDecomposeRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ReliquaryDecomposeRsp buildPartial() {
                final ReliquaryDecomposeRsp result = new ReliquaryDecomposeRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.guidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.guidList_ = this.guidList_;
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
                if (other instanceof ReliquaryDecomposeRsp) {
                    return this.mergeFrom((ReliquaryDecomposeRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ReliquaryDecomposeRsp other) {
                if (other == ReliquaryDecomposeRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.guidList_.isEmpty()) {
                    if (this.guidList_.isEmpty()) {
                        this.guidList_ = other.guidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureGuidListIsMutable();
                        this.guidList_.addAll(other.guidList_);
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
                ReliquaryDecomposeRsp parsedMessage = null;
                try {
                    parsedMessage = ReliquaryDecomposeRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ReliquaryDecomposeRsp)e.getUnfinishedMessage();
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
            
            private void ensureGuidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.guidList_ = GeneratedMessageV3.mutableCopy(this.guidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Long> getGuidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.guidList_) : this.guidList_;
            }
            
            @Override
            public int getGuidListCount() {
                return this.guidList_.size();
            }
            
            @Override
            public long getGuidList(final int index) {
                return this.guidList_.getLong(index);
            }
            
            public Builder setGuidList(final int index, final long value) {
                this.ensureGuidListIsMutable();
                this.guidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addGuidList(final long value) {
                this.ensureGuidListIsMutable();
                this.guidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllGuidList(final Iterable<? extends Long> values) {
                this.ensureGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.guidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearGuidList() {
                this.guidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface ReliquaryDecomposeRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<Long> getGuidListList();
        
        int getGuidListCount();
        
        long getGuidList(final int p0);
    }
}
