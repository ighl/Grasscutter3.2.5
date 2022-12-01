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
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MailChangeNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_MailChangeNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MailChangeNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MailChangeNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MailChangeNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016MailChangeNotify.proto\u001a\u000eMailData.proto\"J\n\u0010MailChangeNotify\u0012\u001c\n\tmail_list\u0018\u000e \u0003(\u000b2\t.MailData\u0012\u0018\n\u0010del_mail_id_list\u0018\b \u0003(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MailChangeNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MailDataOuterClass.getDescriptor() });
        internal_static_MailChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MailChangeNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor, new String[] { "MailList", "DelMailIdList" });
        MailDataOuterClass.getDescriptor();
    }
    
    public static final class MailChangeNotify extends GeneratedMessageV3 implements MailChangeNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MAIL_LIST_FIELD_NUMBER = 14;
        private List<MailDataOuterClass.MailData> mailList_;
        public static final int DEL_MAIL_ID_LIST_FIELD_NUMBER = 8;
        private Internal.IntList delMailIdList_;
        private int delMailIdListMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final MailChangeNotify DEFAULT_INSTANCE;
        private static final Parser<MailChangeNotify> PARSER;
        
        private MailChangeNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.delMailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private MailChangeNotify() {
            this.delMailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.mailList_ = Collections.emptyList();
            this.delMailIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MailChangeNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MailChangeNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.delMailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.delMailIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 66: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.delMailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.delMailIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.delMailIdList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.mailList_ = Collections.unmodifiableList((List<? extends MailDataOuterClass.MailData>)this.mailList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(MailChangeNotify.class, Builder.class);
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
        public List<Integer> getDelMailIdListList() {
            return this.delMailIdList_;
        }
        
        @Override
        public int getDelMailIdListCount() {
            return this.delMailIdList_.size();
        }
        
        @Override
        public int getDelMailIdList(final int index) {
            return this.delMailIdList_.getInt(index);
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
            if (this.getDelMailIdListList().size() > 0) {
                output.writeUInt32NoTag(66);
                output.writeUInt32NoTag(this.delMailIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.delMailIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.delMailIdList_.getInt(i));
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
            int dataSize = 0;
            for (int i = 0; i < this.delMailIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.delMailIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getDelMailIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.delMailIdListMemoizedSerializedSize = dataSize;
            for (int j = 0; j < this.mailList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(14, this.mailList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MailChangeNotify)) {
                return super.equals(obj);
            }
            final MailChangeNotify other = (MailChangeNotify)obj;
            return this.getMailListList().equals(other.getMailListList()) && this.getDelMailIdListList().equals(other.getDelMailIdListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getMailListCount() > 0) {
                hash = 37 * hash + 14;
                hash = 53 * hash + this.getMailListList().hashCode();
            }
            if (this.getDelMailIdListCount() > 0) {
                hash = 37 * hash + 8;
                hash = 53 * hash + this.getDelMailIdListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MailChangeNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MailChangeNotify.PARSER.parseFrom(data);
        }
        
        public static MailChangeNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailChangeNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MailChangeNotify.PARSER.parseFrom(data);
        }
        
        public static MailChangeNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailChangeNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MailChangeNotify.PARSER.parseFrom(data);
        }
        
        public static MailChangeNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MailChangeNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MailChangeNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailChangeNotify.PARSER, input);
        }
        
        public static MailChangeNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static MailChangeNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailChangeNotify.PARSER, input);
        }
        
        public static MailChangeNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MailChangeNotify.PARSER, input, extensionRegistry);
        }
        
        public static MailChangeNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailChangeNotify.PARSER, input);
        }
        
        public static MailChangeNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MailChangeNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MailChangeNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MailChangeNotify prototype) {
            return MailChangeNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MailChangeNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MailChangeNotify getDefaultInstance() {
            return MailChangeNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<MailChangeNotify> parser() {
            return MailChangeNotify.PARSER;
        }
        
        @Override
        public Parser<MailChangeNotify> getParserForType() {
            return MailChangeNotify.PARSER;
        }
        
        @Override
        public MailChangeNotify getDefaultInstanceForType() {
            return MailChangeNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MailChangeNotify();
            PARSER = new AbstractParser<MailChangeNotify>() {
                @Override
                public MailChangeNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MailChangeNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MailChangeNotifyOrBuilder
        {
            private int bitField0_;
            private List<MailDataOuterClass.MailData> mailList_;
            private RepeatedFieldBuilderV3<MailDataOuterClass.MailData, MailDataOuterClass.MailData.Builder, MailDataOuterClass.MailDataOrBuilder> mailListBuilder_;
            private Internal.IntList delMailIdList_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(MailChangeNotify.class, Builder.class);
            }
            
            private Builder() {
                this.mailList_ = Collections.emptyList();
                this.delMailIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.mailList_ = Collections.emptyList();
                this.delMailIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MailChangeNotify.alwaysUseFieldBuilders) {
                    this.getMailListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.mailListBuilder_ == null) {
                    this.mailList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.mailListBuilder_.clear();
                }
                this.delMailIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
            }
            
            @Override
            public MailChangeNotify getDefaultInstanceForType() {
                return MailChangeNotify.getDefaultInstance();
            }
            
            @Override
            public MailChangeNotify build() {
                final MailChangeNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MailChangeNotify buildPartial() {
                final MailChangeNotify result = new MailChangeNotify(this);
                final int from_bitField0_ = this.bitField0_;
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
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.delMailIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.delMailIdList_ = this.delMailIdList_;
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
                if (other instanceof MailChangeNotify) {
                    return this.mergeFrom((MailChangeNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MailChangeNotify other) {
                if (other == MailChangeNotify.getDefaultInstance()) {
                    return this;
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
                        this.mailListBuilder_ = (MailChangeNotify.alwaysUseFieldBuilders ? this.getMailListFieldBuilder() : null);
                    }
                    else {
                        this.mailListBuilder_.addAllMessages(other.mailList_);
                    }
                }
                if (!other.delMailIdList_.isEmpty()) {
                    if (this.delMailIdList_.isEmpty()) {
                        this.delMailIdList_ = other.delMailIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureDelMailIdListIsMutable();
                        this.delMailIdList_.addAll(other.delMailIdList_);
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
                MailChangeNotify parsedMessage = null;
                try {
                    parsedMessage = MailChangeNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MailChangeNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
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
            
            private void ensureDelMailIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.delMailIdList_ = GeneratedMessageV3.mutableCopy(this.delMailIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getDelMailIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.delMailIdList_) : this.delMailIdList_;
            }
            
            @Override
            public int getDelMailIdListCount() {
                return this.delMailIdList_.size();
            }
            
            @Override
            public int getDelMailIdList(final int index) {
                return this.delMailIdList_.getInt(index);
            }
            
            public Builder setDelMailIdList(final int index, final int value) {
                this.ensureDelMailIdListIsMutable();
                this.delMailIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addDelMailIdList(final int value) {
                this.ensureDelMailIdListIsMutable();
                this.delMailIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllDelMailIdList(final Iterable<? extends Integer> values) {
                this.ensureDelMailIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.delMailIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearDelMailIdList() {
                this.delMailIdList_ = GeneratedMessageV3.emptyIntList();
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
    
    public interface MailChangeNotifyOrBuilder extends MessageOrBuilder
    {
        List<MailDataOuterClass.MailData> getMailListList();
        
        MailDataOuterClass.MailData getMailList(final int p0);
        
        int getMailListCount();
        
        List<? extends MailDataOuterClass.MailDataOrBuilder> getMailListOrBuilderList();
        
        MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(final int p0);
        
        List<Integer> getDelMailIdListList();
        
        int getDelMailIdListCount();
        
        int getDelMailIdList(final int p0);
    }
}
