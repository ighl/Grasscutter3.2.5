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

public final class AbilityInvocationsNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AbilityInvocationsNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AbilityInvocationsNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AbilityInvocationsNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AbilityInvocationsNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eAbilityInvocationsNotify.proto\u001a\u0018AbilityInvokeEntry.proto\"@\n\u0018AbilityInvocationsNotify\u0012$\n\u0007invokes\u0018\u0004 \u0003(\u000b2\u0013.AbilityInvokeEntryB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AbilityInvocationsNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilityInvokeEntryOuterClass.getDescriptor() });
        internal_static_AbilityInvocationsNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AbilityInvocationsNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AbilityInvocationsNotifyOuterClass.internal_static_AbilityInvocationsNotify_descriptor, new String[] { "Invokes" });
        AbilityInvokeEntryOuterClass.getDescriptor();
    }
    
    public static final class AbilityInvocationsNotify extends GeneratedMessageV3 implements AbilityInvocationsNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int INVOKES_FIELD_NUMBER = 4;
        private List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry> invokes_;
        private byte memoizedIsInitialized;
        private static final AbilityInvocationsNotify DEFAULT_INSTANCE;
        private static final Parser<AbilityInvocationsNotify> PARSER;
        
        private AbilityInvocationsNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AbilityInvocationsNotify() {
            this.memoizedIsInitialized = -1;
            this.invokes_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AbilityInvocationsNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AbilityInvocationsNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 34: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.invokes_ = new ArrayList<AbilityInvokeEntryOuterClass.AbilityInvokeEntry>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.invokes_.add(input.readMessage(AbilityInvokeEntryOuterClass.AbilityInvokeEntry.parser(), extensionRegistry));
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
                    this.invokes_ = Collections.unmodifiableList((List<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntry>)this.invokes_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return AbilityInvocationsNotifyOuterClass.internal_static_AbilityInvocationsNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AbilityInvocationsNotifyOuterClass.internal_static_AbilityInvocationsNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityInvocationsNotify.class, Builder.class);
        }
        
        @Override
        public List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry> getInvokesList() {
            return this.invokes_;
        }
        
        @Override
        public List<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> getInvokesOrBuilderList() {
            return this.invokes_;
        }
        
        @Override
        public int getInvokesCount() {
            return this.invokes_.size();
        }
        
        @Override
        public AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(final int index) {
            return this.invokes_.get(index);
        }
        
        @Override
        public AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(final int index) {
            return this.invokes_.get(index);
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
            for (int i = 0; i < this.invokes_.size(); ++i) {
                output.writeMessage(4, this.invokes_.get(i));
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
            for (int i = 0; i < this.invokes_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(4, this.invokes_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbilityInvocationsNotify)) {
                return super.equals(obj);
            }
            final AbilityInvocationsNotify other = (AbilityInvocationsNotify)obj;
            return this.getInvokesList().equals(other.getInvokesList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getInvokesCount() > 0) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getInvokesList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AbilityInvocationsNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AbilityInvocationsNotify.PARSER.parseFrom(data);
        }
        
        public static AbilityInvocationsNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityInvocationsNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityInvocationsNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AbilityInvocationsNotify.PARSER.parseFrom(data);
        }
        
        public static AbilityInvocationsNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityInvocationsNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityInvocationsNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AbilityInvocationsNotify.PARSER.parseFrom(data);
        }
        
        public static AbilityInvocationsNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AbilityInvocationsNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AbilityInvocationsNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvocationsNotify.PARSER, input);
        }
        
        public static AbilityInvocationsNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvocationsNotify.PARSER, input, extensionRegistry);
        }
        
        public static AbilityInvocationsNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityInvocationsNotify.PARSER, input);
        }
        
        public static AbilityInvocationsNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AbilityInvocationsNotify.PARSER, input, extensionRegistry);
        }
        
        public static AbilityInvocationsNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvocationsNotify.PARSER, input);
        }
        
        public static AbilityInvocationsNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AbilityInvocationsNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AbilityInvocationsNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AbilityInvocationsNotify prototype) {
            return AbilityInvocationsNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AbilityInvocationsNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AbilityInvocationsNotify getDefaultInstance() {
            return AbilityInvocationsNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AbilityInvocationsNotify> parser() {
            return AbilityInvocationsNotify.PARSER;
        }
        
        @Override
        public Parser<AbilityInvocationsNotify> getParserForType() {
            return AbilityInvocationsNotify.PARSER;
        }
        
        @Override
        public AbilityInvocationsNotify getDefaultInstanceForType() {
            return AbilityInvocationsNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AbilityInvocationsNotify();
            PARSER = new AbstractParser<AbilityInvocationsNotify>() {
                @Override
                public AbilityInvocationsNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AbilityInvocationsNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AbilityInvocationsNotifyOrBuilder
        {
            private int bitField0_;
            private List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry> invokes_;
            private RepeatedFieldBuilderV3<AbilityInvokeEntryOuterClass.AbilityInvokeEntry, AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> invokesBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AbilityInvocationsNotifyOuterClass.internal_static_AbilityInvocationsNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AbilityInvocationsNotifyOuterClass.internal_static_AbilityInvocationsNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AbilityInvocationsNotify.class, Builder.class);
            }
            
            private Builder() {
                this.invokes_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.invokes_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AbilityInvocationsNotify.alwaysUseFieldBuilders) {
                    this.getInvokesFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.invokesBuilder_ == null) {
                    this.invokes_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.invokesBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AbilityInvocationsNotifyOuterClass.internal_static_AbilityInvocationsNotify_descriptor;
            }
            
            @Override
            public AbilityInvocationsNotify getDefaultInstanceForType() {
                return AbilityInvocationsNotify.getDefaultInstance();
            }
            
            @Override
            public AbilityInvocationsNotify build() {
                final AbilityInvocationsNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AbilityInvocationsNotify buildPartial() {
                final AbilityInvocationsNotify result = new AbilityInvocationsNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.invokesBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.invokes_ = Collections.unmodifiableList((List<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntry>)this.invokes_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.invokes_ = this.invokes_;
                }
                else {
                    result.invokes_ = this.invokesBuilder_.build();
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
                if (other instanceof AbilityInvocationsNotify) {
                    return this.mergeFrom((AbilityInvocationsNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AbilityInvocationsNotify other) {
                if (other == AbilityInvocationsNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.invokesBuilder_ == null) {
                    if (!other.invokes_.isEmpty()) {
                        if (this.invokes_.isEmpty()) {
                            this.invokes_ = other.invokes_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureInvokesIsMutable();
                            this.invokes_.addAll(other.invokes_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.invokes_.isEmpty()) {
                    if (this.invokesBuilder_.isEmpty()) {
                        this.invokesBuilder_.dispose();
                        this.invokesBuilder_ = null;
                        this.invokes_ = other.invokes_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.invokesBuilder_ = (AbilityInvocationsNotify.alwaysUseFieldBuilders ? this.getInvokesFieldBuilder() : null);
                    }
                    else {
                        this.invokesBuilder_.addAllMessages(other.invokes_);
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
                AbilityInvocationsNotify parsedMessage = null;
                try {
                    parsedMessage = AbilityInvocationsNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AbilityInvocationsNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureInvokesIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.invokes_ = new ArrayList<AbilityInvokeEntryOuterClass.AbilityInvokeEntry>(this.invokes_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry> getInvokesList() {
                if (this.invokesBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntry>)this.invokes_);
                }
                return this.invokesBuilder_.getMessageList();
            }
            
            @Override
            public int getInvokesCount() {
                if (this.invokesBuilder_ == null) {
                    return this.invokes_.size();
                }
                return this.invokesBuilder_.getCount();
            }
            
            @Override
            public AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(final int index) {
                if (this.invokesBuilder_ == null) {
                    return this.invokes_.get(index);
                }
                return this.invokesBuilder_.getMessage(index);
            }
            
            public Builder setInvokes(final int index, final AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
                if (this.invokesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInvokesIsMutable();
                    this.invokes_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setInvokes(final int index, final AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
                if (this.invokesBuilder_ == null) {
                    this.ensureInvokesIsMutable();
                    this.invokes_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addInvokes(final AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
                if (this.invokesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInvokesIsMutable();
                    this.invokes_.add(value);
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addInvokes(final int index, final AbilityInvokeEntryOuterClass.AbilityInvokeEntry value) {
                if (this.invokesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureInvokesIsMutable();
                    this.invokes_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addInvokes(final AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
                if (this.invokesBuilder_ == null) {
                    this.ensureInvokesIsMutable();
                    this.invokes_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addInvokes(final int index, final AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder builderForValue) {
                if (this.invokesBuilder_ == null) {
                    this.ensureInvokesIsMutable();
                    this.invokes_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllInvokes(final Iterable<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntry> values) {
                if (this.invokesBuilder_ == null) {
                    this.ensureInvokesIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.invokes_);
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearInvokes() {
                if (this.invokesBuilder_ == null) {
                    this.invokes_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeInvokes(final int index) {
                if (this.invokesBuilder_ == null) {
                    this.ensureInvokesIsMutable();
                    this.invokes_.remove(index);
                    this.onChanged();
                }
                else {
                    this.invokesBuilder_.remove(index);
                }
                return this;
            }
            
            public AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder getInvokesBuilder(final int index) {
                return this.getInvokesFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(final int index) {
                if (this.invokesBuilder_ == null) {
                    return this.invokes_.get(index);
                }
                return this.invokesBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> getInvokesOrBuilderList() {
                if (this.invokesBuilder_ != null) {
                    return this.invokesBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder>)this.invokes_);
            }
            
            public AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder addInvokesBuilder() {
                return this.getInvokesFieldBuilder().addBuilder(AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance());
            }
            
            public AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder addInvokesBuilder(final int index) {
                return this.getInvokesFieldBuilder().addBuilder(index, AbilityInvokeEntryOuterClass.AbilityInvokeEntry.getDefaultInstance());
            }
            
            public List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder> getInvokesBuilderList() {
                return this.getInvokesFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AbilityInvokeEntryOuterClass.AbilityInvokeEntry, AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> getInvokesFieldBuilder() {
                if (this.invokesBuilder_ == null) {
                    this.invokesBuilder_ = new RepeatedFieldBuilderV3<AbilityInvokeEntryOuterClass.AbilityInvokeEntry, AbilityInvokeEntryOuterClass.AbilityInvokeEntry.Builder, AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder>(this.invokes_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.invokes_ = null;
                }
                return this.invokesBuilder_;
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
    
    public interface AbilityInvocationsNotifyOrBuilder extends MessageOrBuilder
    {
        List<AbilityInvokeEntryOuterClass.AbilityInvokeEntry> getInvokesList();
        
        AbilityInvokeEntryOuterClass.AbilityInvokeEntry getInvokes(final int p0);
        
        int getInvokesCount();
        
        List<? extends AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder> getInvokesOrBuilderList();
        
        AbilityInvokeEntryOuterClass.AbilityInvokeEntryOrBuilder getInvokesOrBuilder(final int p0);
    }
}
