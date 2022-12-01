// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetAllMailRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetAllMailRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetAllMailRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetAllMailRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetAllMailRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013GetAllMailRsp.proto\u001a\u000eMailData.proto\"q\n\rGetAllMailRsp\u0012\u000f\n\u0007retcode\u0018\b \u0001(\u0005\u0012\u001c\n\tmail_list\u0018\u000e \u0003(\u000b2\t.MailData\u0012\u001b\n\u0013Unk2700_OPEHLDAGICF\u0018\u0001 \u0001(\b\u0012\u0014\n\fis_truncated\u0018\u0002 \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetAllMailRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MailDataOuterClass.getDescriptor() });
        internal_static_GetAllMailRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetAllMailRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetAllMailRspOuterClass.internal_static_GetAllMailRsp_descriptor, new String[] { "Retcode", "MailList", "Unk2700OPEHLDAGICF", "IsTruncated" });
        MailDataOuterClass.getDescriptor();
    }
    
    public static final class GetAllMailRsp extends GeneratedMessageV3 implements GetAllMailRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 8;
        private int retcode_;
        public static final int MAIL_LIST_FIELD_NUMBER = 14;
        private List<MailDataOuterClass.MailData> mailList_;
        public static final int UNK2700_OPEHLDAGICF_FIELD_NUMBER = 1;
        private boolean unk2700OPEHLDAGICF_;
        public static final int IS_TRUNCATED_FIELD_NUMBER = 2;
        private boolean isTruncated_;
        private byte memoizedIsInitialized;
        private static final GetAllMailRsp DEFAULT_INSTANCE;
        private static final Parser<GetAllMailRsp> PARSER;
        
        private GetAllMailRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetAllMailRsp() {
            this.memoizedIsInitialized = -1;
            this.mailList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetAllMailRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetAllMailRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.unk2700OPEHLDAGICF_ = input.readBool();
                            continue;
                        }
                        case 16: {
                            this.isTruncated_ = input.readBool();
                            continue;
                        }
                        case 64: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 114: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.mailList_ = new ArrayList<MailDataOuterClass.MailData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.mailList_.add(input.readMessage(MailDataOuterClass.MailData.parser(), extensionRegistry));
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
                    this.mailList_ = Collections.unmodifiableList((List<? extends MailDataOuterClass.MailData>)this.mailList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetAllMailRspOuterClass.internal_static_GetAllMailRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetAllMailRspOuterClass.internal_static_GetAllMailRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAllMailRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<MailDataOuterClass.MailData> getMailListList() {
            return this.mailList_;
        }
        
        @Override
        public List<? extends MailDataOuterClass.MailDataOrBuilder> getMailListOrBuilderList() {
            return this.mailList_;
        }
        
        @Override
        public int getMailListCount() {
            return this.mailList_.size();
        }
        
        @Override
        public MailDataOuterClass.MailData getMailList(final int index) {
            return this.mailList_.get(index);
        }
        
        @Override
        public MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(final int index) {
            return this.mailList_.get(index);
        }
        
        @Override
        public boolean getUnk2700OPEHLDAGICF() {
            return this.unk2700OPEHLDAGICF_;
        }
        
        @Override
        public boolean getIsTruncated() {
            return this.isTruncated_;
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
            if (this.unk2700OPEHLDAGICF_) {
                output.writeBool(1, this.unk2700OPEHLDAGICF_);
            }
            if (this.isTruncated_) {
                output.writeBool(2, this.isTruncated_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(8, this.retcode_);
            }
            for (int i = 0; i < this.mailList_.size(); ++i) {
                output.writeMessage(14, this.mailList_.get(i));
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
            if (this.unk2700OPEHLDAGICF_) {
                size += CodedOutputStream.computeBoolSize(1, this.unk2700OPEHLDAGICF_);
            }
            if (this.isTruncated_) {
                size += CodedOutputStream.computeBoolSize(2, this.isTruncated_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(8, this.retcode_);
            }
            for (int i = 0; i < this.mailList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(14, this.mailList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAllMailRsp)) {
                return super.equals(obj);
            }
            final GetAllMailRsp other = (GetAllMailRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getMailListList().equals(other.getMailListList()) && this.getUnk2700OPEHLDAGICF() == other.getUnk2700OPEHLDAGICF() && this.getIsTruncated() == other.getIsTruncated() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRetcode();
            if (this.getMailListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getMailListList().hashCode();
            }
            hash = 37 * hash + 1;
            hash = 53 * hash + Internal.hashBoolean(this.getUnk2700OPEHLDAGICF());
            hash = 37 * hash + 2;
            hash = 53 * hash + Internal.hashBoolean(this.getIsTruncated());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetAllMailRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetAllMailRsp.PARSER.parseFrom(data);
        }
        
        public static GetAllMailRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAllMailRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAllMailRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetAllMailRsp.PARSER.parseFrom(data);
        }
        
        public static GetAllMailRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAllMailRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAllMailRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetAllMailRsp.PARSER.parseFrom(data);
        }
        
        public static GetAllMailRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetAllMailRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetAllMailRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailRsp.PARSER, input);
        }
        
        public static GetAllMailRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetAllMailRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAllMailRsp.PARSER, input);
        }
        
        public static GetAllMailRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetAllMailRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetAllMailRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailRsp.PARSER, input);
        }
        
        public static GetAllMailRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetAllMailRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetAllMailRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetAllMailRsp prototype) {
            return GetAllMailRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetAllMailRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetAllMailRsp getDefaultInstance() {
            return GetAllMailRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetAllMailRsp> parser() {
            return GetAllMailRsp.PARSER;
        }
        
        @Override
        public Parser<GetAllMailRsp> getParserForType() {
            return GetAllMailRsp.PARSER;
        }
        
        @Override
        public GetAllMailRsp getDefaultInstanceForType() {
            return GetAllMailRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetAllMailRsp();
            PARSER = new AbstractParser<GetAllMailRsp>() {
                @Override
                public GetAllMailRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetAllMailRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetAllMailRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private List<MailDataOuterClass.MailData> mailList_;
            private RepeatedFieldBuilderV3<MailDataOuterClass.MailData, MailDataOuterClass.MailData.Builder, MailDataOuterClass.MailDataOrBuilder> mailListBuilder_;
            private boolean unk2700OPEHLDAGICF_;
            private boolean isTruncated_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetAllMailRspOuterClass.internal_static_GetAllMailRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetAllMailRspOuterClass.internal_static_GetAllMailRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAllMailRsp.class, Builder.class);
            }
            
            private Builder() {
                this.mailList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.mailList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetAllMailRsp.alwaysUseFieldBuilders) {
                    this.getMailListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                if (this.mailListBuilder_ == null) {
                    this.mailList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.mailListBuilder_.clear();
                }
                this.unk2700OPEHLDAGICF_ = false;
                this.isTruncated_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetAllMailRspOuterClass.internal_static_GetAllMailRsp_descriptor;
            }
            
            @Override
            public GetAllMailRsp getDefaultInstanceForType() {
                return GetAllMailRsp.getDefaultInstance();
            }
            
            @Override
            public GetAllMailRsp build() {
                final GetAllMailRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetAllMailRsp buildPartial() {
                final GetAllMailRsp result = new GetAllMailRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if (this.mailListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.mailList_ = Collections.unmodifiableList((List<? extends MailDataOuterClass.MailData>)this.mailList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.mailList_ = this.mailList_;
                }
                else {
                    result.mailList_ = this.mailListBuilder_.build();
                }
                result.unk2700OPEHLDAGICF_ = this.unk2700OPEHLDAGICF_;
                result.isTruncated_ = this.isTruncated_;
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
                if (other instanceof GetAllMailRsp) {
                    return this.mergeFrom((GetAllMailRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetAllMailRsp other) {
                if (other == GetAllMailRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.mailListBuilder_ == null) {
                    if (!other.mailList_.isEmpty()) {
                        if (this.mailList_.isEmpty()) {
                            this.mailList_ = other.mailList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureMailListIsMutable();
                            this.mailList_.addAll(other.mailList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.mailList_.isEmpty()) {
                    if (this.mailListBuilder_.isEmpty()) {
                        this.mailListBuilder_.dispose();
                        this.mailListBuilder_ = null;
                        this.mailList_ = other.mailList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.mailListBuilder_ = (GetAllMailRsp.alwaysUseFieldBuilders ? this.getMailListFieldBuilder() : null);
                    }
                    else {
                        this.mailListBuilder_.addAllMessages(other.mailList_);
                    }
                }
                if (other.getUnk2700OPEHLDAGICF()) {
                    this.setUnk2700OPEHLDAGICF(other.getUnk2700OPEHLDAGICF());
                }
                if (other.getIsTruncated()) {
                    this.setIsTruncated(other.getIsTruncated());
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
                GetAllMailRsp parsedMessage = null;
                try {
                    parsedMessage = GetAllMailRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetAllMailRsp)e.getUnfinishedMessage();
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
            
            private void ensureMailListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.mailList_ = new ArrayList<MailDataOuterClass.MailData>(this.mailList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<MailDataOuterClass.MailData> getMailListList() {
                if (this.mailListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends MailDataOuterClass.MailData>)this.mailList_);
                }
                return this.mailListBuilder_.getMessageList();
            }
            
            @Override
            public int getMailListCount() {
                if (this.mailListBuilder_ == null) {
                    return this.mailList_.size();
                }
                return this.mailListBuilder_.getCount();
            }
            
            @Override
            public MailDataOuterClass.MailData getMailList(final int index) {
                if (this.mailListBuilder_ == null) {
                    return this.mailList_.get(index);
                }
                return this.mailListBuilder_.getMessage(index);
            }
            
            public Builder setMailList(final int index, final MailDataOuterClass.MailData value) {
                if (this.mailListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMailListIsMutable();
                    this.mailList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setMailList(final int index, final MailDataOuterClass.MailData.Builder builderForValue) {
                if (this.mailListBuilder_ == null) {
                    this.ensureMailListIsMutable();
                    this.mailList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addMailList(final MailDataOuterClass.MailData value) {
                if (this.mailListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMailListIsMutable();
                    this.mailList_.add(value);
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addMailList(final int index, final MailDataOuterClass.MailData value) {
                if (this.mailListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureMailListIsMutable();
                    this.mailList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addMailList(final MailDataOuterClass.MailData.Builder builderForValue) {
                if (this.mailListBuilder_ == null) {
                    this.ensureMailListIsMutable();
                    this.mailList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addMailList(final int index, final MailDataOuterClass.MailData.Builder builderForValue) {
                if (this.mailListBuilder_ == null) {
                    this.ensureMailListIsMutable();
                    this.mailList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllMailList(final Iterable<? extends MailDataOuterClass.MailData> values) {
                if (this.mailListBuilder_ == null) {
                    this.ensureMailListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.mailList_);
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearMailList() {
                if (this.mailListBuilder_ == null) {
                    this.mailList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeMailList(final int index) {
                if (this.mailListBuilder_ == null) {
                    this.ensureMailListIsMutable();
                    this.mailList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.mailListBuilder_.remove(index);
                }
                return this;
            }
            
            public MailDataOuterClass.MailData.Builder getMailListBuilder(final int index) {
                return this.getMailListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(final int index) {
                if (this.mailListBuilder_ == null) {
                    return this.mailList_.get(index);
                }
                return this.mailListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends MailDataOuterClass.MailDataOrBuilder> getMailListOrBuilderList() {
                if (this.mailListBuilder_ != null) {
                    return this.mailListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends MailDataOuterClass.MailDataOrBuilder>)this.mailList_);
            }
            
            public MailDataOuterClass.MailData.Builder addMailListBuilder() {
                return this.getMailListFieldBuilder().addBuilder(MailDataOuterClass.MailData.getDefaultInstance());
            }
            
            public MailDataOuterClass.MailData.Builder addMailListBuilder(final int index) {
                return this.getMailListFieldBuilder().addBuilder(index, MailDataOuterClass.MailData.getDefaultInstance());
            }
            
            public List<MailDataOuterClass.MailData.Builder> getMailListBuilderList() {
                return this.getMailListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<MailDataOuterClass.MailData, MailDataOuterClass.MailData.Builder, MailDataOuterClass.MailDataOrBuilder> getMailListFieldBuilder() {
                if (this.mailListBuilder_ == null) {
                    this.mailListBuilder_ = new RepeatedFieldBuilderV3<MailDataOuterClass.MailData, MailDataOuterClass.MailData.Builder, MailDataOuterClass.MailDataOrBuilder>(this.mailList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.mailList_ = null;
                }
                return this.mailListBuilder_;
            }
            
            @Override
            public boolean getUnk2700OPEHLDAGICF() {
                return this.unk2700OPEHLDAGICF_;
            }
            
            public Builder setUnk2700OPEHLDAGICF(final boolean value) {
                this.unk2700OPEHLDAGICF_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700OPEHLDAGICF() {
                this.unk2700OPEHLDAGICF_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean getIsTruncated() {
                return this.isTruncated_;
            }
            
            public Builder setIsTruncated(final boolean value) {
                this.isTruncated_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsTruncated() {
                this.isTruncated_ = false;
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
    
    public interface GetAllMailRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<MailDataOuterClass.MailData> getMailListList();
        
        MailDataOuterClass.MailData getMailList(final int p0);
        
        int getMailListCount();
        
        List<? extends MailDataOuterClass.MailDataOrBuilder> getMailListOrBuilderList();
        
        MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(final int p0);
        
        boolean getUnk2700OPEHLDAGICF();
        
        boolean getIsTruncated();
    }
}
