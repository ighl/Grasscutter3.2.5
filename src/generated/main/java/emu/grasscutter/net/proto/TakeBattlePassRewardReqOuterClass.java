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
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TakeBattlePassRewardReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeBattlePassRewardReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeBattlePassRewardReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeBattlePassRewardReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeBattlePassRewardReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dTakeBattlePassRewardReq.proto\u001a BattlePassRewardTakeOption.proto\"P\n\u0017TakeBattlePassRewardReq\u00125\n\u0010take_option_list\u0018\f \u0003(\u000b2\u001b.BattlePassRewardTakeOptionB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeBattlePassRewardReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassRewardTakeOptionOuterClass.getDescriptor() });
        internal_static_TakeBattlePassRewardReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeBattlePassRewardReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_descriptor, new String[] { "TakeOptionList" });
        BattlePassRewardTakeOptionOuterClass.getDescriptor();
    }
    
    public static final class TakeBattlePassRewardReq extends GeneratedMessageV3 implements TakeBattlePassRewardReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TAKE_OPTION_LIST_FIELD_NUMBER = 12;
        private List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> takeOptionList_;
        private byte memoizedIsInitialized;
        private static final TakeBattlePassRewardReq DEFAULT_INSTANCE;
        private static final Parser<TakeBattlePassRewardReq> PARSER;
        
        private TakeBattlePassRewardReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeBattlePassRewardReq() {
            this.memoizedIsInitialized = -1;
            this.takeOptionList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeBattlePassRewardReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeBattlePassRewardReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 98: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.takeOptionList_ = new ArrayList<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.takeOptionList_.add(input.readMessage(BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.parser(), extensionRegistry));
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
                    this.takeOptionList_ = Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>)this.takeOptionList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassRewardReq.class, Builder.class);
        }
        
        @Override
        public List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList() {
            return this.takeOptionList_;
        }
        
        @Override
        public List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListOrBuilderList() {
            return this.takeOptionList_;
        }
        
        @Override
        public int getTakeOptionListCount() {
            return this.takeOptionList_.size();
        }
        
        @Override
        public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(final int index) {
            return this.takeOptionList_.get(index);
        }
        
        @Override
        public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(final int index) {
            return this.takeOptionList_.get(index);
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
            for (int i = 0; i < this.takeOptionList_.size(); ++i) {
                output.writeMessage(12, this.takeOptionList_.get(i));
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
            for (int i = 0; i < this.takeOptionList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(12, this.takeOptionList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakeBattlePassRewardReq)) {
                return super.equals(obj);
            }
            final TakeBattlePassRewardReq other = (TakeBattlePassRewardReq)obj;
            return this.getTakeOptionListList().equals(other.getTakeOptionListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTakeOptionListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getTakeOptionListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeBattlePassRewardReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardReq.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardReq.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardReq.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardReq.PARSER, input);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassRewardReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassRewardReq.PARSER, input);
        }
        
        public static TakeBattlePassRewardReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassRewardReq.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardReq.PARSER, input);
        }
        
        public static TakeBattlePassRewardReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeBattlePassRewardReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeBattlePassRewardReq prototype) {
            return TakeBattlePassRewardReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeBattlePassRewardReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeBattlePassRewardReq getDefaultInstance() {
            return TakeBattlePassRewardReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeBattlePassRewardReq> parser() {
            return TakeBattlePassRewardReq.PARSER;
        }
        
        @Override
        public Parser<TakeBattlePassRewardReq> getParserForType() {
            return TakeBattlePassRewardReq.PARSER;
        }
        
        @Override
        public TakeBattlePassRewardReq getDefaultInstanceForType() {
            return TakeBattlePassRewardReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeBattlePassRewardReq();
            PARSER = new AbstractParser<TakeBattlePassRewardReq>() {
                @Override
                public TakeBattlePassRewardReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeBattlePassRewardReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeBattlePassRewardReqOrBuilder
        {
            private int bitField0_;
            private List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> takeOptionList_;
            private RepeatedFieldBuilderV3<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> takeOptionListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassRewardReq.class, Builder.class);
            }
            
            private Builder() {
                this.takeOptionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.takeOptionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeBattlePassRewardReq.alwaysUseFieldBuilders) {
                    this.getTakeOptionListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.takeOptionListBuilder_ == null) {
                    this.takeOptionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.takeOptionListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeBattlePassRewardReqOuterClass.internal_static_TakeBattlePassRewardReq_descriptor;
            }
            
            @Override
            public TakeBattlePassRewardReq getDefaultInstanceForType() {
                return TakeBattlePassRewardReq.getDefaultInstance();
            }
            
            @Override
            public TakeBattlePassRewardReq build() {
                final TakeBattlePassRewardReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeBattlePassRewardReq buildPartial() {
                final TakeBattlePassRewardReq result = new TakeBattlePassRewardReq(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.takeOptionListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.takeOptionList_ = Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>)this.takeOptionList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.takeOptionList_ = this.takeOptionList_;
                }
                else {
                    result.takeOptionList_ = this.takeOptionListBuilder_.build();
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
                if (other instanceof TakeBattlePassRewardReq) {
                    return this.mergeFrom((TakeBattlePassRewardReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeBattlePassRewardReq other) {
                if (other == TakeBattlePassRewardReq.getDefaultInstance()) {
                    return this;
                }
                if (this.takeOptionListBuilder_ == null) {
                    if (!other.takeOptionList_.isEmpty()) {
                        if (this.takeOptionList_.isEmpty()) {
                            this.takeOptionList_ = other.takeOptionList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureTakeOptionListIsMutable();
                            this.takeOptionList_.addAll(other.takeOptionList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.takeOptionList_.isEmpty()) {
                    if (this.takeOptionListBuilder_.isEmpty()) {
                        this.takeOptionListBuilder_.dispose();
                        this.takeOptionListBuilder_ = null;
                        this.takeOptionList_ = other.takeOptionList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.takeOptionListBuilder_ = (TakeBattlePassRewardReq.alwaysUseFieldBuilders ? this.getTakeOptionListFieldBuilder() : null);
                    }
                    else {
                        this.takeOptionListBuilder_.addAllMessages(other.takeOptionList_);
                    }
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
                TakeBattlePassRewardReq parsedMessage = null;
                try {
                    parsedMessage = TakeBattlePassRewardReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeBattlePassRewardReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureTakeOptionListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.takeOptionList_ = new ArrayList<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>(this.takeOptionList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList() {
                if (this.takeOptionListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>)this.takeOptionList_);
                }
                return this.takeOptionListBuilder_.getMessageList();
            }
            
            @Override
            public int getTakeOptionListCount() {
                if (this.takeOptionListBuilder_ == null) {
                    return this.takeOptionList_.size();
                }
                return this.takeOptionListBuilder_.getCount();
            }
            
            @Override
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(final int index) {
                if (this.takeOptionListBuilder_ == null) {
                    return this.takeOptionList_.get(index);
                }
                return this.takeOptionListBuilder_.getMessage(index);
            }
            
            public Builder setTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
                if (this.takeOptionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTakeOptionList(final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
                if (this.takeOptionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(value);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
                if (this.takeOptionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTakeOptionList(final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTakeOptionList(final Iterable<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> values) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.takeOptionList_);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTakeOptionList() {
                if (this.takeOptionListBuilder_ == null) {
                    this.takeOptionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTakeOptionList(final int index) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.remove(index);
                }
                return this;
            }
            
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder getTakeOptionListBuilder(final int index) {
                return this.getTakeOptionListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(final int index) {
                if (this.takeOptionListBuilder_ == null) {
                    return this.takeOptionList_.get(index);
                }
                return this.takeOptionListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListOrBuilderList() {
                if (this.takeOptionListBuilder_ != null) {
                    return this.takeOptionListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder>)this.takeOptionList_);
            }
            
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder addTakeOptionListBuilder() {
                return this.getTakeOptionListFieldBuilder().addBuilder(BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance());
            }
            
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder addTakeOptionListBuilder(final int index) {
                return this.getTakeOptionListFieldBuilder().addBuilder(index, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance());
            }
            
            public List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder> getTakeOptionListBuilderList() {
                return this.getTakeOptionListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListFieldBuilder() {
                if (this.takeOptionListBuilder_ == null) {
                    this.takeOptionListBuilder_ = new RepeatedFieldBuilderV3<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder>(this.takeOptionList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.takeOptionList_ = null;
                }
                return this.takeOptionListBuilder_;
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
    
    public interface TakeBattlePassRewardReqOrBuilder extends MessageOrBuilder
    {
        List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList();
        
        BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(final int p0);
        
        int getTakeOptionListCount();
        
        List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListOrBuilderList();
        
        BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(final int p0);
    }
}
