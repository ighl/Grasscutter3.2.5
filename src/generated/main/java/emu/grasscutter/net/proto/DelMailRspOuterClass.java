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

public final class DelMailRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_DelMailRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DelMailRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DelMailRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DelMailRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0010DelMailRsp.proto\"3\n\nDelMailRsp\u0012\u000f\n\u0007retcode\u0018\u000b \u0001(\u0005\u0012\u0014\n\fmail_id_list\u0018\u0005 \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DelMailRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_DelMailRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DelMailRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DelMailRspOuterClass.internal_static_DelMailRsp_descriptor, new String[] { "Retcode", "MailIdList" });
    }
    
    public static final class DelMailRsp extends GeneratedMessageV3 implements DelMailRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 11;
        private int retcode_;
        public static final int MAIL_ID_LIST_FIELD_NUMBER = 5;
        private Internal.IntList mailIdList_;
        private int mailIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final DelMailRsp DEFAULT_INSTANCE;
        private static final Parser<DelMailRsp> PARSER;
        
        private DelMailRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private DelMailRsp() {
            this.mailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.mailIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DelMailRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DelMailRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                                this.mailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.mailIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 42: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.mailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.mailIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 88: {
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
                    this.mailIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DelMailRspOuterClass.internal_static_DelMailRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DelMailRspOuterClass.internal_static_DelMailRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(DelMailRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<Integer> getMailIdListList() {
            return this.mailIdList_;
        }
        
        @Override
        public int getMailIdListCount() {
            return this.mailIdList_.size();
        }
        
        @Override
        public int getMailIdList(final int index) {
            return this.mailIdList_.getInt(index);
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
            if (this.getMailIdListList().size() > 0) {
                output.writeUInt32NoTag(42);
                output.writeUInt32NoTag(this.mailIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.mailIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.mailIdList_.getInt(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(11, this.retcode_);
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
            for (int i = 0; i < this.mailIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.mailIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getMailIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.mailIdListMemoizedSerializedSize = dataSize;
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(11, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DelMailRsp)) {
                return super.equals(obj);
            }
            final DelMailRsp other = (DelMailRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getMailIdListList().equals(other.getMailIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getRetcode();
            if (this.getMailIdListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getMailIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DelMailRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DelMailRsp.PARSER.parseFrom(data);
        }
        
        public static DelMailRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelMailRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelMailRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DelMailRsp.PARSER.parseFrom(data);
        }
        
        public static DelMailRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelMailRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelMailRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DelMailRsp.PARSER.parseFrom(data);
        }
        
        public static DelMailRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DelMailRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DelMailRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailRsp.PARSER, input);
        }
        
        public static DelMailRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailRsp.PARSER, input, extensionRegistry);
        }
        
        public static DelMailRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DelMailRsp.PARSER, input);
        }
        
        public static DelMailRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DelMailRsp.PARSER, input, extensionRegistry);
        }
        
        public static DelMailRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailRsp.PARSER, input);
        }
        
        public static DelMailRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DelMailRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DelMailRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DelMailRsp prototype) {
            return DelMailRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DelMailRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DelMailRsp getDefaultInstance() {
            return DelMailRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<DelMailRsp> parser() {
            return DelMailRsp.PARSER;
        }
        
        @Override
        public Parser<DelMailRsp> getParserForType() {
            return DelMailRsp.PARSER;
        }
        
        @Override
        public DelMailRsp getDefaultInstanceForType() {
            return DelMailRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DelMailRsp();
            PARSER = new AbstractParser<DelMailRsp>() {
                @Override
                public DelMailRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DelMailRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DelMailRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private Internal.IntList mailIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DelMailRspOuterClass.internal_static_DelMailRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DelMailRspOuterClass.internal_static_DelMailRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(DelMailRsp.class, Builder.class);
            }
            
            private Builder() {
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DelMailRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DelMailRspOuterClass.internal_static_DelMailRsp_descriptor;
            }
            
            @Override
            public DelMailRsp getDefaultInstanceForType() {
                return DelMailRsp.getDefaultInstance();
            }
            
            @Override
            public DelMailRsp build() {
                final DelMailRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DelMailRsp buildPartial() {
                final DelMailRsp result = new DelMailRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.mailIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.mailIdList_ = this.mailIdList_;
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
                if (other instanceof DelMailRsp) {
                    return this.mergeFrom((DelMailRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DelMailRsp other) {
                if (other == DelMailRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.mailIdList_.isEmpty()) {
                    if (this.mailIdList_.isEmpty()) {
                        this.mailIdList_ = other.mailIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureMailIdListIsMutable();
                        this.mailIdList_.addAll(other.mailIdList_);
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
                DelMailRsp parsedMessage = null;
                try {
                    parsedMessage = DelMailRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DelMailRsp)e.getUnfinishedMessage();
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
            
            private void ensureMailIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.mailIdList_ = GeneratedMessageV3.mutableCopy(this.mailIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getMailIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.mailIdList_) : this.mailIdList_;
            }
            
            @Override
            public int getMailIdListCount() {
                return this.mailIdList_.size();
            }
            
            @Override
            public int getMailIdList(final int index) {
                return this.mailIdList_.getInt(index);
            }
            
            public Builder setMailIdList(final int index, final int value) {
                this.ensureMailIdListIsMutable();
                this.mailIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addMailIdList(final int value) {
                this.ensureMailIdListIsMutable();
                this.mailIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllMailIdList(final Iterable<? extends Integer> values) {
                this.ensureMailIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.mailIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearMailIdList() {
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface DelMailRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<Integer> getMailIdListList();
        
        int getMailIdListCount();
        
        int getMailIdList(final int p0);
    }
}
